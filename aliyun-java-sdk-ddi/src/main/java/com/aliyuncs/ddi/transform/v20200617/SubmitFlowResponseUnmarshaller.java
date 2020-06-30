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

package com.aliyuncs.ddi.transform.v20200617;

import com.aliyuncs.ddi.model.v20200617.SubmitFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitFlowResponseUnmarshaller {

	public static SubmitFlowResponse unmarshall(SubmitFlowResponse submitFlowResponse, UnmarshallerContext _ctx) {
		
		submitFlowResponse.setRequestId(_ctx.stringValue("SubmitFlowResponse.RequestId"));
		submitFlowResponse.setData(_ctx.stringValue("SubmitFlowResponse.Data"));
		submitFlowResponse.setId(_ctx.stringValue("SubmitFlowResponse.Id"));
		submitFlowResponse.setInstanceId(_ctx.stringValue("SubmitFlowResponse.InstanceId"));
	 
	 	return submitFlowResponse;
	}
}