package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lch1/m1;", "Lfb2/o;", "Ljava/lang/Object;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "headerText", "headerActionText", "Lkotlin/Function0;", "", "headerAction", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m1 extends fb2.o<Object> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f27414g;

    public /* synthetic */ m1(Context context, String str, String str2, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? null : aVar);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        obj.getClass();
        return true;
    }

    @Override // fb2.o
    public final e23.a<Unit> p() {
        return this.f27414g;
    }

    @Override // fb2.o
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getF27413f() {
        return this.f27413f;
    }

    @Override // fb2.o
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getF27412e() {
        return this.f27412e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Context context, String str, String str2, e23.a<Unit> aVar) {
        super(context);
        ds.e0.p(context, str, str2);
        this.f27412e = str;
        this.f27413f = str2;
        this.f27414g = aVar;
    }
}
