package vv;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvv/m;", "Lfb2/o;", "Luv/i;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "sectionTitle", "sectionActionText", "Lkotlin/Function0;", "", "sectionAction", "<init>", "(Landroid/content/Context;ILjava/lang/Integer;Le23/a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends fb2.o<uv.i<?>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f180419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f180420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f180421g;

    public /* synthetic */ m(Context context, int i14, Integer num, e23.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, i14, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? null : aVar);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((uv.i) obj).getClass();
        return true;
    }

    @Override // fb2.o
    public final e23.a<Unit> p() {
        return this.f180421g;
    }

    @Override // fb2.o
    public final String q() {
        Integer num = this.f180420f;
        String strB = num != null ? b(num.intValue()) : null;
        return strB == null ? "" : strB;
    }

    @Override // fb2.o
    public final String r() {
        String strB = b(this.f180419e);
        strB.getClass();
        return strB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i14, Integer num, e23.a<Unit> aVar) {
        super(context);
        context.getClass();
        this.f180419e = i14;
        this.f180420f = num;
        this.f180421g = aVar;
    }
}
