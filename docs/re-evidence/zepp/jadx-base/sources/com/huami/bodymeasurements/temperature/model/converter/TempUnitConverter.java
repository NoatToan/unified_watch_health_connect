package com.huami.bodymeasurements.temperature.model.converter;

import android.content.Context;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/converter/TempUnitConverter;", "Lorg/koin/core/component/KoinComponent;", "", "c", "", "tempInUnitC", "a", "tempInUnitF", "b", "", "getTempUnitString", "getTempWithUnitString", "getTempString", "temp", "getTempInUnitC", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "externalApi", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempUnitConverter implements KoinComponent {

    @NotNull
    public static final TempUnitConverter INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static final TempExternalApi externalApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static final Context applicationContext;

    static {
        TempUnitConverter tempUnitConverter = new TempUnitConverter();
        INSTANCE = tempUnitConverter;
        externalApi = ScopesKt.tempExternalApi(tempUnitConverter.getKoin());
        applicationContext = (Context) tempUnitConverter.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(Context.class), null, null);
    }

    private TempUnitConverter() {
    }

    private final float a(float tempInUnitC) {
        return ((tempInUnitC * 9.0f) / 5.0f) + 32.0f;
    }

    private final float b(float tempInUnitF) {
        return ((tempInUnitF - 32.0f) * 5.0f) / 9.0f;
    }

    private final int c() {
        TempExternalApi tempExternalApi = externalApi;
        if (tempExternalApi == null) {
            return 0;
        }
        return tempExternalApi.getTempUnit();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final float getTempInUnitC(float temp) {
        return c() == 1 ? b(temp) : temp;
    }

    @Nullable
    public final String getTempString(float tempInUnitC) {
        return c() == 0 ? NumberFormatExKt.formatWithDecimal(Float.valueOf(tempInUnitC), 1) : NumberFormatExKt.formatWithDecimal(Float.valueOf(a(tempInUnitC)), 1);
    }

    @NotNull
    public final String getTempUnitString() {
        String string;
        if (c() == 0) {
            Context context = applicationContext;
            if (context == null || (string = context.getString(R.string.bm_temperature_unit_c)) == null) {
                return "";
            }
        } else {
            Context context2 = applicationContext;
            if (context2 == null || (string = context2.getString(R.string.bm_temperature_unit_f)) == null) {
                return "";
            }
        }
        return string;
    }

    @NotNull
    public final String getTempWithUnitString(float tempInUnitC) {
        String string;
        if (c() == 0) {
            String withDecimal = NumberFormatExKt.formatWithDecimal(Float.valueOf(tempInUnitC), 1);
            Context context = applicationContext;
            if (context == null || (string = context.getString(R.string.bm_temperature_value_centigrade, withDecimal)) == null) {
                return "";
            }
        } else {
            String withDecimal2 = NumberFormatExKt.formatWithDecimal(Float.valueOf(a(tempInUnitC)), 1);
            Context context2 = applicationContext;
            if (context2 == null || (string = context2.getString(R.string.bm_temperature_value_fahrenheit, withDecimal2)) == null) {
                return "";
            }
        }
        return string;
    }
}
