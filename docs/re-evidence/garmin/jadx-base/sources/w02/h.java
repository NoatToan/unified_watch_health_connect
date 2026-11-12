package w02;

import ch.qos.logback.core.joran.action.Action;
import o4.s0;
import p005kotlin.Metadata;
import p008y1.b2;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lw02/h;", "Lw02/j;", "Lw02/g;", "Le2/d;", "lazyItemScope", "Lw02/r;", "reorderableLazyListState", "", Action.KEY_ATTRIBUTE, "<init>", "(Le2/d;Lw02/r;Ljava/lang/Object;)V", "", "dragging", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends j implements g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181106a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f181106a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e2.d dVar, r rVar, Object obj) {
        super(dVar, rVar, obj);
        dVar.getClass();
        rVar.getClass();
        obj.getClass();
    }

    @Override // w02.g
    public final h4.r b(h4.r rVar) {
        rVar.getClass();
        r rVar2 = this.f181108b;
        return ((Boolean) p0.f(new vv0.n(8, this.f181109c, rVar2)).getF182175a()).booleanValue() ? s0.a(h4.p.b(rVar, 1.0f), new b(1, rVar2.g(), this)) : rVar;
    }
}
