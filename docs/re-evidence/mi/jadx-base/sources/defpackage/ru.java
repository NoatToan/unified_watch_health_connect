package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lru;", "", "Ljava/util/Locale;", PluginDeviceInfo.FMODEL, "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class ru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ru f32899a = new ru();

    @NotNull
    public final Locale a() {
        Locale locale = Locale.getDefault();
        if (!su.a(locale)) {
            return new Locale(Locale.ENGLISH.getLanguage(), locale.getCountry());
        }
        Intrinsics.checkNotNullExpressionValue(locale, "default");
        return locale;
    }
}
