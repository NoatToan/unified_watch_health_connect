package com.xiaomi.hm.health.device.service;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.xiaomi.hm.health.device.service.ProtoBufferUtils;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/service/ProtoBufferUtils;", "", "Lcom/google/gson/JsonElement;", "toJsonElement", "", "", "a", "Ljava/util/List;", "skipNames", "b", "skipStarts", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ProtoBufferUtils {

    @NotNull
    public static final ProtoBufferUtils INSTANCE = new ProtoBufferUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<String> skipNames = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"unknownFields", "memoizedIsInitialized", "memoizedSerializedSize", "memoizedHashCode"});

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final List<String> skipStarts = kotlin.collections.e.listOf("bitField");

    private ProtoBufferUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Field field) {
        String name = field.getName();
        return (name.length() <= 1 || !StringsKt__StringsKt.endsWith$default((CharSequence) name, '_', false, 2, (Object) null)) ? name : name.substring(0, name.length() - 1);
    }

    @JvmStatic
    @Nullable
    public static final JsonElement toJsonElement(@NotNull Object obj) {
        return new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() { // from class: com.xiaomi.hm.health.device.service.ProtoBufferUtils$toJsonElement$gson$1
            @Override // com.google.gson.ExclusionStrategy
            public boolean shouldSkipClass(@Nullable Class<?> clazz) {
                return false;
            }

            @Override // com.google.gson.ExclusionStrategy
            public boolean shouldSkipField(@Nullable FieldAttributes f) {
                String name;
                boolean z;
                if (f == null || (name = f.getName()) == null) {
                    return false;
                }
                if (!ProtoBufferUtils.skipNames.contains(name)) {
                    List list = ProtoBufferUtils.skipStarts;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (m.startsWith$default(name, (String) it2.next(), false, 2, null)) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                }
                return true;
            }
        }).setFieldNamingStrategy(new FieldNamingStrategy() { // from class: x46
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return ProtoBufferUtils.b(field);
            }
        }).create().toJsonTree(obj);
    }
}
