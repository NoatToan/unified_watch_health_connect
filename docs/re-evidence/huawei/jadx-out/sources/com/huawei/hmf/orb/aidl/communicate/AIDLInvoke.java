package com.huawei.hmf.orb.aidl.communicate;

import android.os.RemoteException;
import com.huawei.hmf.orb.CommonCode;
import com.huawei.hmf.orb.IMessageEntity;
import com.huawei.hmf.orb.aidl.IAIDLCallback;
import com.huawei.hmf.orb.aidl.IAIDLInvoke;
import com.huawei.hmf.services.codec.MessageCodec;

/* JADX INFO: loaded from: classes33.dex */
public class AIDLInvoke extends IAIDLInvoke.Stub {
    private static final String TAG = "AIDLInvoke";
    private MessageCenter center;

    protected void onRequest(AIDLRequest aIDLRequest, IMessageEntity iMessageEntity) {
    }

    public AIDLInvoke() {
        this.center = null;
        this.center = MessageCenter.getInstance();
    }

    @Override // com.huawei.hmf.orb.aidl.IAIDLInvoke
    public void syncCall(DataBuffer dataBuffer) throws RemoteException {
        handleCall(dataBuffer, new VoidAIDLResponse());
    }

    @Override // com.huawei.hmf.orb.aidl.IAIDLInvoke
    public void asyncCall(DataBuffer dataBuffer, IAIDLCallback iAIDLCallback) throws RemoteException {
        handleCall(dataBuffer, new AIDLResponse(iAIDLCallback));
    }

    private void handleCall(DataBuffer dataBuffer, AIDLResponse aIDLResponse) throws RemoteException {
        if (dataBuffer == null) {
            return;
        }
        aIDLResponse.setProtocol(dataBuffer.getProtocol());
        AIDLRequest<IMessageEntity> aIDLRequestMakeRequest = this.center.makeRequest(dataBuffer.URI, true);
        if (aIDLRequestMakeRequest != null) {
            MessageCodec messageCodecFind = CodecLookup.find(dataBuffer.getProtocol());
            if (dataBuffer.header != null) {
                aIDLRequestMakeRequest.clientIdentity = new ClientIdentity(RequestHeader.from(messageCodecFind, dataBuffer.header));
            }
            IMessageEntity iMessageEntityMakeParam = aIDLRequestMakeRequest.makeParam();
            if (dataBuffer.getBodySize() > 0) {
                messageCodecFind.decode(dataBuffer.getBody(), iMessageEntityMakeParam);
            }
            aIDLResponse.setURI(dataBuffer.URI);
            aIDLRequestMakeRequest.response = aIDLResponse;
            try {
                onRequest(aIDLRequestMakeRequest, iMessageEntityMakeParam);
                aIDLRequestMakeRequest.execute(iMessageEntityMakeParam);
                return;
            } catch (Exception unused) {
                aIDLResponse.failure(CommonCode.ErrorCode.INTERNAL_ERROR);
                return;
            }
        }
        aIDLResponse.failure(CommonCode.ErrorCode.NAMING_INVALID);
    }
}
