package f2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Bg\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf2/k;", "Lg2/u$a;", "Lkotlin/Function1;", "", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function2;", "Lf2/t;", "Lf2/c;", TtmlNode.TAG_SPAN, NotificationConstants.KEY_DATA_MIME_TYPE, "Lf2/r;", "", "item", "<init>", "(Le23/l;Le23/p;Le23/l;Le23/r;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements g2.u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Integer, Object> f68220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<t, Integer, c> f68221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<Integer, Object> f68222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.r<r, Integer, p3.m, Integer, Unit> f68223d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.l<? super Integer, ? extends Object> lVar, e23.p<? super t, ? super Integer, c> pVar, e23.l<? super Integer, ? extends Object> lVar2, e23.r<? super r, ? super Integer, ? super p3.m, ? super Integer, Unit> rVar) {
        this.f68220a = lVar;
        this.f68221b = pVar;
        this.f68222c = lVar2;
        this.f68223d = rVar;
    }

    @Override // g2.u.a
    public final e23.l<Integer, Object> getKey() {
        return this.f68220a;
    }

    @Override // g2.u.a
    public final e23.l<Integer, Object> getType() {
        return this.f68222c;
    }
}
