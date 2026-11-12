package a73;

import am.x0;
import android.content.Context;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TemperatureCache;
import com.google.android.material.color.utilities.TonalPalette;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.stream.Streams;
import ty1.g2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1854b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f1853a = i14;
        this.f1854b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i14 = this.f1853a;
        Object obj2 = this.f1854b;
        switch (i14) {
            case 0:
                return Failable.apply((FailableFunction) obj2, obj);
            case 1:
                return dh.b.A((Context) obj2, ((x0) obj).f4360c).toLowerCase(Locale.ROOT);
            case 2:
                return ((Streams.ArrayCollector) obj2).lambda$finisher$1((List) obj);
            case 3:
                return DynamicColor.lambda$fromArgb$0((TonalPalette) obj2, (DynamicScheme) obj);
            case 4:
                return DynamicColor.lambda$fromArgb$1((Hct) obj2, (DynamicScheme) obj);
            case 5:
                return ((TemperatureCache) obj2).lambda$getHctsByTemp$0((Hct) obj);
            case 6:
                return ((Path) obj2).relativize((Path) obj);
            case 7:
                return Functions.apply((Functions.FailableFunction) obj2, obj);
            case 8:
                return ((org.apache.commons.lang3.Streams.ArrayCollector) obj2).lambda$finisher$1((List) obj);
            case 9:
                com.garmin.android.apps.connectmobile.navigation.h.f39377a.getClass();
                return com.garmin.android.apps.connectmobile.navigation.h.c((l22.a) obj2, (String) obj);
            case 10:
                return (v82.a) ((g2) obj2).invoke(obj);
            default:
                Parcelable.Creator<UserSettingsDTO> creator = UserSettingsDTO.CREATOR;
                return (wi1.l) ((w40.d) obj2).invoke(obj);
        }
    }
}
