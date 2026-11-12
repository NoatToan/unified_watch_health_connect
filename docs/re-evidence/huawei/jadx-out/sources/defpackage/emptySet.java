package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: renamed from: zal, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a+\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\u0006\u001a$\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\b\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\b\u0000\u0010\u0002H\u0087\b¢\u0006\u0002\u0010\f\u001a5\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\b\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\r\u001a$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u0002H\u0087\b¢\u0006\u0002\u0010\u0011\u001a5\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002¢\u0006\u0002\u0010\u0012\u001a'\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010\u0016\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00142\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00020\u0005\"\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001aF\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0001\"\u0004\b\u0000\u0010\u00182\u001f\b\u0001\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aN\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0001\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u001f\b\u0001\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a!\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"emptySet", "", ExifInterface.GPS_DIRECTION_TRUE, "setOf", "elements", "", "([Ljava/lang/Object;)Ljava/util/Set;", "mutableSetOf", "", "hashSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "()Ljava/util/HashSet;", "([Ljava/lang/Object;)Ljava/util/HashSet;", "linkedSetOf", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "()Ljava/util/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "setOfNotNull", "", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)Ljava/util/Set;", "buildSet", ExifInterface.LONGITUDE_EAST, "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "orEmpty", "optimizeReadOnlySet", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class emptySet extends setOf {
    public static final <T> Set<T> d() {
        return zaa.f53923a;
    }

    public static final <T> Set<T> e(T... tArr) {
        zcp.c(tArr, "");
        return yzk.h(tArr);
    }

    public static final <T> Set<T> b(T... tArr) {
        zcp.c(tArr, "");
        return (Set) yzk.a(tArr, new LinkedHashSet(zae.e(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        zcp.c(set, "");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : zaj.e(set.iterator().next());
        }
        return zaj.d();
    }
}
