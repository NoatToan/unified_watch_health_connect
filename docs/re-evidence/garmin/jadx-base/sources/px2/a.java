package px2;

import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.proto.generated.GDISaMD;
import com.garmin.proto.generated.GDISaMDExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.SaMDEcg;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpx2/a;", "", "Ldt2/g;", "messenger", "<init>", "(Ldt2/g;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt2.g f141780a;

    public a(dt2.g gVar) {
        gVar.getClass();
        this.f141780a = gVar;
    }

    public static Object c(GDIGarminHealth.Service.Builder builder, dt2.k kVar, v13.c cVar) {
        GDISmartProto.Smart smartA = tu2.a.a(builder);
        smartA.getClass();
        Object objA = kVar.a(smartA, cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    public final Object a(GDIGarminHealth.Service.Builder builder, v13.c cVar) {
        GDISmartProto.Smart smartA = tu2.a.a(builder);
        smartA.getClass();
        Object objC = this.f141780a.c(smartA, cVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    public final Object b(SaMDEcg.Service.Builder builder, v13.c cVar) {
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDISaMDExtension.samdService, GDISaMD.Service.newBuilder().setEcgService(builder.build().toByteString()).build()).build();
        smartBuild.getClass();
        return this.f141780a.b(smartBuild, cVar);
    }
}
