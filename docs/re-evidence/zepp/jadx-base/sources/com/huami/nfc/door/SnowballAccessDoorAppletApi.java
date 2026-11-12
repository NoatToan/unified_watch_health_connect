package com.huami.nfc.door;

import android.util.Base64;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.city.CityAppletExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.api.AccessDoorAppletApi;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.InitRequestTask;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.text.Charsets;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002J4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/nfc/door/SnowballAccessDoorAppletApi;", "Lcom/huami/nfc/door/api/AccessDoorAppletApi;", "Lcom/huami/nfc/door/NfcTag;", "tag", "", "phoneNum", "districtName", "", "dataType", "Lcom/huami/nfc/base/PayResponse;", GoogleApiAvailabilityLight.a, "b", "content", "a", "c", "install", "aid", "deleteApp", "Lcom/huami/nfc/web/InitRequestTask;", "Lcom/huami/nfc/web/InitRequestTask;", "task", "<init>", "(Lcom/huami/nfc/web/InitRequestTask;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class SnowballAccessDoorAppletApi implements AccessDoorAppletApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestTask task;

    public SnowballAccessDoorAppletApi(@NotNull InitRequestTask initRequestTask) {
        this.task = initRequestTask;
    }

    private final String a(String content) {
        byte[] bytes;
        if (content.length() > 0) {
            bytes = CityAppletExtensionsKt.toBytes(content);
        } else {
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(content, "null cannot be cast to non-null type java.lang.String");
            bytes = content.getBytes(charset);
        }
        return StringsKt___StringsKt.dropLast(Base64.encodeToString(bytes, 2), 2);
    }

    private final String b(NfcTag tag, String phoneNum, String districtName, int dataType) {
        String blockData = tag.getBlockData(tag.getResult() != 9);
        return Constant.jsonBody(r.mapOf(TuplesKt.to("uid", tag.getUid()), TuplesKt.to("data", a(blockData)), TuplesKt.to("md5", SnowballAccessDoorAppletApiKt.md5(blockData)), TuplesKt.to("mobile_num", phoneNum), TuplesKt.to("district_name", districtName), TuplesKt.to("dataType", Integer.valueOf(dataType)))).toString();
    }

    private final PayResponse<String> c() {
        return this.task.apply(r.mutableMapOf(TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "issue"), TuplesKt.to("biz_serial_no", ""), TuplesKt.to("product_sub_type", "4")));
    }

    private final PayResponse<String> d(NfcTag tag, String phoneNum, String districtName, int dataType) {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("atqa", tag.getAtqa());
        pairArr[1] = TuplesKt.to("sak", tag.getSak());
        pairArr[2] = TuplesKt.to("biz_serial_no", "");
        pairArr[3] = TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "issue");
        pairArr[4] = TuplesKt.to("product_sub_type", "4");
        if (phoneNum == null) {
            phoneNum = "";
        }
        if (districtName == null) {
            districtName = "";
        }
        pairArr[5] = TuplesKt.to("extra_info", b(tag, phoneNum, districtName, dataType));
        Map<String, Object> mapMutableMapOf = r.mutableMapOf(pairArr);
        WorkerInfo workerInfo = tag.getWorkerInfo();
        if (workerInfo != null) {
            mapMutableMapOf.put("bizType", 1);
            mapMutableMapOf.put("biz_info", Constant.jsonBody(q.mapOf(TuplesKt.to("workCode", workerInfo.getNumber()))).toString());
        }
        return this.task.apply(mapMutableMapOf);
    }

    @Override // com.huami.nfc.door.api.AccessDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return this.task.apply(r.mutableMapOf(TuplesKt.to("biz_serial_no", ""), TuplesKt.to("aid", aid), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "delete"), TuplesKt.to("product_sub_type", "4")));
    }

    @Override // com.huami.nfc.door.api.AccessDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag, @Nullable String phoneNum, @Nullable String districtName, int dataType) {
        return tag != null ? d(tag, phoneNum, districtName, dataType) : c();
    }
}
