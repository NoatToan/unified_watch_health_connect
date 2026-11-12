package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lzj;", "Lug;", "", "Ljava/util/Locale;", "locale", "Lxj;", PluginDeviceInfo.FMODEL, "language", "", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class zj implements ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, xj> f41330a = MapsKt__MapsKt.mapOf(TuplesKt.to("IW", xj.HE), TuplesKt.to("IN", xj.ID), TuplesKt.to("JI", xj.YI));

    @NotNull
    public xj a(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "locale.language");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = language.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        xj xjVar = this.f41330a.get(upperCase);
        if (xjVar != null) {
            return xjVar;
        }
        try {
            String language2 = locale.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language2, "locale.language");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = language2.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            return xj.valueOf(upperCase2);
        } catch (Exception e) {
            le.a("convert2HmLanguageEnum", e);
            return xj.EN;
        }
    }

    @Override // defpackage.ug
    public boolean a(@NotNull Locale locale, @NotNull xj language) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(language, "language");
        return a(locale) == language;
    }
}
