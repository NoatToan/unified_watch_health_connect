package pn2;

import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpn2/n;", "", "Lhs2/a;", TtmlNode.TAG_METADATA, "Lkotlin/Function0;", "", "getDeviceName", "<init>", "(Lhs2/a;Le23/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs2.a f138791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<String> f138792b;

    static {
        Parcelable.Creator<hs2.a> creator = hs2.a.CREATOR;
    }

    public n(hs2.a aVar, e23.a<String> aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f138791a = aVar;
        this.f138792b = aVar2;
    }

    public final qn2.v a(String str, String str2, String str3, String str4) {
        str4.getClass();
        qn2.u uVar = qn2.u.f145900a;
        return new qn2.v(uVar.c(), str, uVar.a(str2, this.f138792b.invoke(), String.valueOf(this.f138791a.getFirmwareVersion())), str3, str4);
    }

    public final qn2.t b(String str, String str2, String str3) {
        qn2.u uVar = qn2.u.f145900a;
        return new qn2.t(uVar.c(), str, uVar.a(str2, this.f138792b.invoke(), String.valueOf(this.f138791a.getFirmwareVersion())), str3);
    }

    public final qn2.s c(String str, String str2, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        qn2.u uVar = qn2.u.f145900a;
        return new qn2.s(uVar.c(), str, str2, uVar.a(str3, this.f138792b.invoke(), String.valueOf(this.f138791a.getFirmwareVersion())), str4);
    }
}
