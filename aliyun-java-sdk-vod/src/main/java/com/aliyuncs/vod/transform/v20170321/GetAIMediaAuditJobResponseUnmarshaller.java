/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResultItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResultItem.ResultItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResultItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterListItem3;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopListItem4;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterListItem;
import com.aliyuncs.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIMediaAuditJobResponseUnmarshaller {

	public static GetAIMediaAuditJobResponse unmarshall(GetAIMediaAuditJobResponse getAIMediaAuditJobResponse, UnmarshallerContext _ctx) {
		
		getAIMediaAuditJobResponse.setRequestId(_ctx.stringValue("GetAIMediaAuditJobResponse.RequestId"));

		MediaAuditJob mediaAuditJob = new MediaAuditJob();
		mediaAuditJob.setJobId(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.JobId"));
		mediaAuditJob.setMediaId(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.MediaId"));
		mediaAuditJob.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Type"));
		mediaAuditJob.setStatus(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Status"));
		mediaAuditJob.setCode(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Code"));
		mediaAuditJob.setMessage(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Message"));
		mediaAuditJob.setCreationTime(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.CreationTime"));
		mediaAuditJob.setCompleteTime(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.CompleteTime"));

		Data data = new Data();
		data.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.Suggestion"));
		data.setAbnormalModules(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AbnormalModules"));
		data.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.Label"));

		VideoResult videoResult = new VideoResult();
		videoResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.Suggestion"));
		videoResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.Label"));

		TerrorismResult terrorismResult = new TerrorismResult();
		terrorismResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.Suggestion"));
		terrorismResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.Label"));
		terrorismResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.MaxScore"));
		terrorismResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.AverageScore"));

		List<CounterListItem> counterList = new ArrayList<CounterListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList.Length"); i++) {
			CounterListItem counterListItem = new CounterListItem();
			counterListItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList["+ i +"].Label"));
			counterListItem.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList["+ i +"].Count"));

			counterList.add(counterListItem);
		}
		terrorismResult.setCounterList(counterList);

		List<TopListItem> topList = new ArrayList<TopListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList.Length"); i++) {
			TopListItem topListItem = new TopListItem();
			topListItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Label"));
			topListItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Score"));
			topListItem.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Timestamp"));
			topListItem.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Url"));

			topList.add(topListItem);
		}
		terrorismResult.setTopList(topList);
		videoResult.setTerrorismResult(terrorismResult);

		PornResult pornResult = new PornResult();
		pornResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.Suggestion"));
		pornResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.Label"));
		pornResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.MaxScore"));
		pornResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.AverageScore"));

		List<CounterListItem3> counterList1 = new ArrayList<CounterListItem3>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList.Length"); i++) {
			CounterListItem3 counterListItem3 = new CounterListItem3();
			counterListItem3.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList["+ i +"].Label"));
			counterListItem3.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList["+ i +"].Count"));

			counterList1.add(counterListItem3);
		}
		pornResult.setCounterList1(counterList1);

		List<TopListItem4> topList2 = new ArrayList<TopListItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList.Length"); i++) {
			TopListItem4 topListItem4 = new TopListItem4();
			topListItem4.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Label"));
			topListItem4.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Score"));
			topListItem4.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Timestamp"));
			topListItem4.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Url"));

			topList2.add(topListItem4);
		}
		pornResult.setTopList2(topList2);
		videoResult.setPornResult(pornResult);
		data.setVideoResult(videoResult);

		List<ImageResultItem> imageResult = new ArrayList<ImageResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult.Length"); i++) {
			ImageResultItem imageResultItem = new ImageResultItem();
			imageResultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Suggestion"));
			imageResultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Label"));
			imageResultItem.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Type"));
			imageResultItem.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Url"));

			List<ResultItem> result = new ArrayList<ResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result.Length"); j++) {
				ResultItem resultItem = new ResultItem();
				resultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Suggestion"));
				resultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Label"));
				resultItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Score"));
				resultItem.setScene(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Scene"));

				result.add(resultItem);
			}
			imageResultItem.setResult(result);

			imageResult.add(imageResultItem);
		}
		data.setImageResult(imageResult);

		List<TextResultItem> textResult = new ArrayList<TextResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult.Length"); i++) {
			TextResultItem textResultItem = new TextResultItem();
			textResultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Suggestion"));
			textResultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Label"));
			textResultItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Score"));
			textResultItem.setScene(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Scene"));
			textResultItem.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Type"));
			textResultItem.setContent(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Content"));

			textResult.add(textResultItem);
		}
		data.setTextResult(textResult);
		mediaAuditJob.setData(data);
		getAIMediaAuditJobResponse.setMediaAuditJob(mediaAuditJob);
	 
	 	return getAIMediaAuditJobResponse;
	}
}