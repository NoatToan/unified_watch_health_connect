package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/braintreepayments/api/HttpResponse;", "", TtmlNode.TAG_BODY, "", "timing", "Lcom/braintreepayments/api/HttpResponseTiming;", "(Ljava/lang/String;Lcom/braintreepayments/api/HttpResponseTiming;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getTiming", "()Lcom/braintreepayments/api/HttpResponseTiming;", "setTiming", "(Lcom/braintreepayments/api/HttpResponseTiming;)V", "component1", "component2", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "SharedUtils_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class tv {
    private tx d;
    private String e;

    public tv(String str, tx txVar) {
        zcp.c(txVar, "");
        this.e = str;
        this.d = txVar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final tx getD() {
        return this.d;
    }

    public String toString() {
        return "HttpResponse(body=" + this.e + ", timing=" + this.d + g4.l;
    }

    public int hashCode() {
        String str = this.e;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.d.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tv)) {
            return false;
        }
        tv tvVar = (tv) other;
        return zcp.b((Object) this.e, (Object) tvVar.e) && zcp.b(this.d, tvVar.d);
    }
}
