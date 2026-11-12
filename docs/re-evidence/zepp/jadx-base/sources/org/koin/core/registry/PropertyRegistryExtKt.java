package org.koin.core.registry;

import com.huami.passport.Configs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.error.NoPropertyFileFoundException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0000¨\u0006\u000b"}, d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "Ljava/util/Properties;", Configs.Params.PROPERTIES, "", "saveProperties", "", "fileName", "loadPropertiesFromFile", "content", "a", "loadEnvironmentProperties", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class PropertyRegistryExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "load properties from environment";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return Intrinsics.stringPlus("load properties from ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "loaded properties from file:'" + this.a + '\'';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Properties a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Properties properties) {
            super(0);
            this.a = properties;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "load " + this.a.size() + " properties";
        }
    }

    private static final Properties a(String str) throws IOException {
        Properties properties = new Properties();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        properties.load(new ByteArrayInputStream(str.getBytes(charset)));
        return properties;
    }

    public static final void loadEnvironmentProperties(@NotNull PropertyRegistry propertyRegistry) {
        propertyRegistry.get_koin().getLogger().log(Level.DEBUG, a.a);
        saveProperties(propertyRegistry, System.getProperties());
        Map<String, String> map = System.getenv();
        Properties properties = new Properties();
        properties.putAll(map);
        saveProperties(propertyRegistry, properties);
    }

    public static final void loadPropertiesFromFile(@NotNull PropertyRegistry propertyRegistry, @NotNull String str) throws NoPropertyFileFoundException {
        String str2;
        propertyRegistry.get_koin().getLogger().log(Level.DEBUG, new b(str));
        URL resource = Koin.class.getResource(str);
        if (resource == null) {
            str2 = null;
        } else {
            str2 = new String(TextStreamsKt.readBytes(resource), Charsets.UTF_8);
        }
        if (str2 != null) {
            propertyRegistry.get_koin().getLogger().log(Level.INFO, new c(str));
            saveProperties(propertyRegistry, a(str2));
        } else {
            throw new NoPropertyFileFoundException("No properties found for file '" + str + '\'');
        }
    }

    public static final void saveProperties(@NotNull PropertyRegistry propertyRegistry, @NotNull Properties properties) {
        propertyRegistry.get_koin().getLogger().log(Level.DEBUG, new d(properties));
        for (Map.Entry entry : r.toMap(properties).entrySet()) {
            propertyRegistry.saveProperty$koin_core((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
