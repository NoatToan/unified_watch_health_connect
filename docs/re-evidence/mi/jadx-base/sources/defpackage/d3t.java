package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.protobuf.ByteString;
import com.miui.tsmclient.common.net.request.SecureRequestV2;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d3t extends SecureRequestV2<b> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("apdu")
        public String f15060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("expectStatusWordRegex")
        public String f15061b;

        @SerializedName("index")
        public int c;

        public String a() {
            return this.f15060a;
        }

        public String b() {
            return this.f15061b;
        }

        public int c() {
            return this.c;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("apdus")
        public List<a> f15062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("aid")
        public String f15063b;

        public TsmRpcModels.TsmAPDUCommand a() {
            ArrayList arrayList = new ArrayList();
            for (a aVar : b()) {
                arrayList.add(TsmRpcModels.TsmCAPDU.newBuilder().setApdu(ByteString.copyFrom(Coder.hexStringToBytes(aVar.a()))).setExpectSwRegex(aVar.b()).setIndex(aVar.c()).build());
            }
            return TsmRpcModels.TsmAPDUCommand.newBuilder().setResult(0).setHasMore(false).addAllApdus(arrayList).setAid(TextUtils.isEmpty(this.f15063b) ? "" : this.f15063b).build();
        }

        public List<a> b() {
            return this.f15062a;
        }
    }

    public d3t(String str) {
        super("POST", TSMAuthContants.URL_MIFARE_CARD_BACKUP_BY_CPLC, b.class);
        addParams("sessionId", str);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequestV2, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            String cplc = new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC();
            if (TextUtils.isEmpty(cplc)) {
                return;
            }
            addParams("cplc", cplc);
        } catch (InterruptedException e) {
            LogUtils.e("MifareCardBackupRequest, get cplc failed.", e);
        }
    }

    public d3t(String str, String str2, String str3) {
        super("POST", TSMAuthContants.URL_MIFARE_CARD_BACKUP_BY_CID, b.class);
        addParams("sessionId", str);
        addParams("cid", str2);
        addParams("aid", str3);
    }
}
