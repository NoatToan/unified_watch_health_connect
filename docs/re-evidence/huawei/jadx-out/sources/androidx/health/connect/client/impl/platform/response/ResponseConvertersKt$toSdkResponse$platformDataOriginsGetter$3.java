package androidx.health.connect.client.impl.platform.response;

import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import androidx.core.view.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import androidx.health.connect.client.records.FhirVersion$$ExternalSyntheticApiModelOutline0;
import defpackage.zcn;
import defpackage.zcp;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$3 extends zcn implements Function1<AggregationType<Object>, Set<DataOrigin>> {
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Set<DataOrigin> invoke(AggregationType<Object> aggregationType) {
        return invoke2(FhirVersion$$ExternalSyntheticApiModelOutline0.m424m((Object) aggregationType));
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Set<DataOrigin> invoke2(AggregationType<Object> aggregationType) {
        zcp.c(aggregationType, "");
        return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m71m(this.receiver).getDataOrigins(aggregationType);
    }

    ResponseConvertersKt$toSdkResponse$platformDataOriginsGetter$3(Object obj) {
        super(1, obj, FhirVersion$$ExternalSyntheticApiModelOutline0.m$2(), "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0);
    }
}
