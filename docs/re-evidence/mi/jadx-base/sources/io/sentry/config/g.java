package io.sentry.config;

import defpackage.fwo;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class g {
    @NotNull
    public static f a() {
        Properties propertiesA;
        Properties propertiesA2;
        fwo fwoVar = new fwo();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i());
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesA2 = new e(property, fwoVar).a()) != null) {
            arrayList.add(new h(propertiesA2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesA = new e(str, fwoVar).a()) != null) {
            arrayList.add(new h(propertiesA));
        }
        Properties propertiesA3 = new b(fwoVar).a();
        if (propertiesA3 != null) {
            arrayList.add(new h(propertiesA3));
        }
        Properties propertiesA4 = new e("sentry.properties", fwoVar).a();
        if (propertiesA4 != null) {
            arrayList.add(new h(propertiesA4));
        }
        return new c(arrayList);
    }
}
