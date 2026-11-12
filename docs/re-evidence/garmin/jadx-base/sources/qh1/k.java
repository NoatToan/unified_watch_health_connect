package qh1;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0007¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lqh1/k;", "", "", "deviceId", "Lc83/a0;", "Lrh1/b;", "b", "(JLt13/d;)Ljava/lang/Object;", "bodyComposition", "a", "(JLrh1/b;Lt13/d;)Ljava/lang/Object;", "", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f144740a = a.f144741a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqh1/k$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f144741a = new a();

        private a() {
        }
    }

    @i83.p("/weightscale-service/custom-metrics/{deviceId}")
    Object a(@i83.s("deviceId") long j8, @i83.a rh1.b bVar, t13.d<? super a0<rh1.b>> dVar);

    @i83.f("/weightscale-service/custom-metrics/{deviceId}")
    Object b(@i83.s("deviceId") long j8, t13.d<? super a0<rh1.b>> dVar);

    @i83.b("/weightscale-service/custom-metrics/{deviceId}")
    Object c(@i83.s("deviceId") long j8, t13.d<? super a0<Unit>> dVar);
}
