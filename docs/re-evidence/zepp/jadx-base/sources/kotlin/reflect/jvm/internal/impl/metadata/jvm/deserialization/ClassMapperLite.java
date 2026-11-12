package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    @NotNull
    private static final String a = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    @NotNull
    private static final Map<String, String> b;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", LogUtil.I, "Float", "F", "Long", "J", "Double", LogUtil.D});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listListOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listListOf.get(i2));
                int i4 = i2 + 1;
                linkedHashMap.put(sb.toString(), listListOf.get(i4));
                linkedHashMap.put(str + '/' + ((String) listListOf.get(i2)) + "Array", Intrinsics.stringPlus("[", listListOf.get(i4)));
                if (i2 == progressionLastElement) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        linkedHashMap.put(Intrinsics.stringPlus(a, "/Unit"), "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", StatEvent.Key.NUMBER, "Comparable", "Enum"})) {
            a(linkedHashMap, str2, Intrinsics.stringPlus("java/lang/", str2));
        }
        for (String str3 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", AIApiConstants.Map.NAME, "ListIterator"})) {
            a(linkedHashMap, Intrinsics.stringPlus("collections/", str3), Intrinsics.stringPlus("java/util/", str3));
            a(linkedHashMap, Intrinsics.stringPlus("collections/Mutable", str3), Intrinsics.stringPlus("java/util/", str3));
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        while (true) {
            int i5 = i + 1;
            String strStringPlus = Intrinsics.stringPlus("Function", Integer.valueOf(i));
            StringBuilder sb2 = new StringBuilder();
            String str4 = a;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i);
            a(linkedHashMap, strStringPlus, sb2.toString());
            a(linkedHashMap, Intrinsics.stringPlus("reflect/KFunction", Integer.valueOf(i)), Intrinsics.stringPlus(str4, "/reflect/KFunction"));
            if (i5 > 22) {
                break;
            } else {
                i = i5;
            }
        }
        for (String str5 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            a(linkedHashMap, Intrinsics.stringPlus(str5, ".Companion"), a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        b = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(a + '/' + str, 'L' + str2 + ';');
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String str) {
        String str2 = b.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + m.replace$default(str, '.', '$', false, 4, (Object) null) + ';';
    }
}
