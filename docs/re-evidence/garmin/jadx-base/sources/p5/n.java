package p5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp5/n;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(Le23/a;Le23/a;Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Float> f136046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Float> f136047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136048c;

    public n(e23.a<Float> aVar, e23.a<Float> aVar2, boolean z14) {
        this.f136046a = aVar;
        this.f136047b = aVar2;
        this.f136048c = z14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScrollAxisRange(value=");
        sb3.append(this.f136046a.invoke().floatValue());
        sb3.append(", maxValue=");
        sb3.append(this.f136047b.invoke().floatValue());
        sb3.append(", reverseScrolling=");
        return am.j.t(sb3, this.f136048c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ n(e23.a aVar, e23.a aVar2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, aVar2, (i14 & 4) != 0 ? false : z14);
    }
}
