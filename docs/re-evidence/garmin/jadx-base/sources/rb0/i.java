package rb0;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import y80.b0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lrb0/i;", "Landroidx/lifecycle/u1;", "Lzb0/u0;", "deviceEnum", "Ly80/b0;", "deviceStorageRepository", "<init>", "(Lzb0/u0;Ly80/b0;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f151567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f151568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f151569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f151570d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lrb0/i$a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.legacy_devices.LegacySyncAnimationViewModel$uiState$1", f = "LegacySyncAnimationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<r53.j<? super a>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super a> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            i iVar = i.this;
            iVar.getClass();
            ge1.b.T(v1.a(iVar), null, null, new j(iVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(u0 u0Var, b0 b0Var) {
        u0Var.getClass();
        b0Var.getClass();
        this.f151567a = u0Var;
        this.f151568b = b0Var;
        p2 p2VarA = q2.a(new a(true, false, null, null, 0, null, null, 126, null));
        this.f151569c = p2VarA;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this.f151570d = s.K(new v(new b(null), s.d(p2VarA)), v1.a(this), k2.a.a(k2.f150703a, 2), new a(true, false, objArr, null, 0, objArr2, null, 126, null));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lrb0/i$a;", "", "", "isLoading", "isError", "Lhv/a;", "animationHolder", "Ljt2/a;", "currentDrawable", "", "currentDrawableIndex", "Landroid/graphics/drawable/Drawable;", "deviceFrame", "Lzb0/u0;", "deviceEnum", "<init>", "(ZZLhv/a;Ljt2/a;ILandroid/graphics/drawable/Drawable;Lzb0/u0;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f151571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f151572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hv.a f151573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final jt2.a f151574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f151575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Drawable f151576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u0 f151577g;

        public /* synthetic */ a(boolean z14, boolean z15, hv.a aVar, jt2.a aVar2, int i14, Drawable drawable, u0 u0Var, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? null : aVar, (i15 & 8) != 0 ? null : aVar2, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? null : drawable, (i15 & 64) != 0 ? u0.f203733h : u0Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f151571a == aVar.f151571a && this.f151572b == aVar.f151572b && p005kotlin.jvm.internal.s.g(this.f151573c, aVar.f151573c) && p005kotlin.jvm.internal.s.g(this.f151574d, aVar.f151574d) && this.f151575e == aVar.f151575e && p005kotlin.jvm.internal.s.g(this.f151576f, aVar.f151576f) && this.f151577g == aVar.f151577g;
        }

        public final int hashCode() {
            int iG = q6.f.g(Boolean.hashCode(this.f151571a) * 31, 31, this.f151572b);
            hv.a aVar = this.f151573c;
            int iHashCode = (iG + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jt2.a aVar2 = this.f151574d;
            int iD = r1.q2.d(this.f151575e, (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31);
            Drawable drawable = this.f151576f;
            return this.f151577g.hashCode() + ((iD + (drawable != null ? drawable.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("UiState(isLoading=", ", isError=", ", animationHolder=", this.f151571a, this.f151572b);
            sbM.append(this.f151573c);
            sbM.append(", currentDrawable=");
            sbM.append(this.f151574d);
            sbM.append(", currentDrawableIndex=");
            sbM.append(this.f151575e);
            sbM.append(", deviceFrame=");
            sbM.append(this.f151576f);
            sbM.append(", deviceEnum=");
            sbM.append(this.f151577g);
            sbM.append(")");
            return sbM.toString();
        }

        public a(boolean z14, boolean z15, hv.a aVar, jt2.a aVar2, int i14, Drawable drawable, u0 u0Var) {
            u0Var.getClass();
            this.f151571a = z14;
            this.f151572b = z15;
            this.f151573c = aVar;
            this.f151574d = aVar2;
            this.f151575e = i14;
            this.f151576f = drawable;
            this.f151577g = u0Var;
        }

        public a() {
            this(false, false, null, null, 0, null, null, 127, null);
        }
    }
}
