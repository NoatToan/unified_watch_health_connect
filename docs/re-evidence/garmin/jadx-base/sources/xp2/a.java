package xp2;

import androidx.lifecycle.s0;
import g8.i;
import o53.l1;
import o53.m1;
import p005kotlin.Metadata;
import uy2.d;
import uy2.e;
import uy2.g0;
import uy2.j;
import uy2.k;
import uy2.n;
import uy2.p0;
import uy2.r;
import uy2.v;
import xy2.o;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000f8'@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lxp2/a;", "Lry2/a;", "", "w3", "()V", "", "unitID", "Lo53/l1;", "S3", "(J)Lo53/l1;", "Landroidx/lifecycle/s0;", "", "L3", "()Landroidx/lifecycle/s0;", "isDeviceAddedForCurrentUser", "Lzn2/z0;", "A1", "()Lzn2/z0;", "m1", "(Lzn2/z0;)V", "fitPayServiceProvider", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a extends ry2.a<a> {

    /* JADX INFO: renamed from: xp2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxp2/a$a;", "Lxy2/o;", "Lo53/l1;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3571a implements o<l1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f191869a;

        public C3571a() {
            e eVar = e.f173458a;
            m1 m1VarC = i.c();
            eVar.getClass();
            this.f191869a = new d(m1VarC);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final l1 getF173457a() {
            return (l1) this.f191869a.f173457a;
        }
    }

    @n(objectClass = z0.class)
    /* JADX INFO: renamed from: A1 */
    z0 getFitPayServiceProvider();

    @g0(description = "Device was added")
    @j(keys = {"checkIsDeviceAdded"})
    @v(description = "Device was not added")
    s0<Boolean> L3();

    @p0(keys = {"checkIsDeviceAdded"})
    @r(providerClass = C3571a.class)
    l1 S3(long unitID);

    void m1(z0 z0Var);

    @k
    void w3();
}
