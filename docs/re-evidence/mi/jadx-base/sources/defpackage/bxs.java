package defpackage;

import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.DoorCardArtsListInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class bxs extends SecureRequest<CommonResponseInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MifareCardInfo f4714b;

    public bxs(MifareCardInfo mifareCardInfo, DoorCardArtsListInfo.ArtInfo artInfo) {
        super("GET", TSMAuthContants.URL_MIFARE_UPDATE_ART, CommonResponseInfo.class);
        this.f4714b = mifareCardInfo;
        addParams(TSMAuthContants.PARAM_VCM_AID, mifareCardInfo.mAid);
        if (artInfo != null) {
            addParams(TSMAuthContants.PARAM_ART_ID, String.valueOf(artInfo.getId()));
        }
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            addParams("cplc", this.f4714b.getTerminal().getCPLC());
        } catch (IOException | InterruptedException e) {
            throw new IOException("UpdateDoorCardArtRequest getExtraParams failed", e);
        }
    }
}
