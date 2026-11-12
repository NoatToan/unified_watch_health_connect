package e2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le2/j;", "Lg2/u$a;", "Lkotlin/Function1;", "", "", Action.KEY_ATTRIBUTE, NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function2;", "Le2/d;", "", "item", "<init>", "(Le23/l;Le23/l;Le23/r;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements g2.u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Integer, Object> f62469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<Integer, Object> f62470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.r<d, Integer, p3.m, Integer, Unit> f62471c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.l<? super Integer, ? extends Object> lVar, e23.l<? super Integer, ? extends Object> lVar2, e23.r<? super d, ? super Integer, ? super p3.m, ? super Integer, Unit> rVar) {
        this.f62469a = lVar;
        this.f62470b = lVar2;
        this.f62471c = rVar;
    }

    @Override // g2.u.a
    public final e23.l<Integer, Object> getKey() {
        return this.f62469a;
    }

    @Override // g2.u.a
    public final e23.l<Integer, Object> getType() {
        return this.f62470b;
    }
}
