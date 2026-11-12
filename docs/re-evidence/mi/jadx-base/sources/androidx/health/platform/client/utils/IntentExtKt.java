package androidx.health.platform.client.utils;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.health.platform.client.proto.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u0007\u001aG\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\u0010\b\u0000\u0010\u000b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/content/Intent;", "", "name", "", "Landroidx/health/platform/client/proto/a;", "messages", "putProtoMessages", "(Landroid/content/Intent;Ljava/lang/String;Ljava/util/Collection;)Landroid/content/Intent;", "", "byteArrays", "putByteArraysExtra", "T", "Lkotlin/Function1;", "parser", "", "getProtoMessages", "(Landroid/content/Intent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "getByteArraysExtra", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/List;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nIntentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentExt.kt\nandroidx/health/platform/client/utils/IntentExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n1864#2,3:56\n1549#2:59\n1620#2,3:60\n*S KotlinDebug\n*F\n+ 1 IntentExt.kt\nandroidx/health/platform/client/utils/IntentExtKt\n*L\n27#1:52\n27#1:53,3\n33#1:56,3\n43#1:59\n43#1:60,3\n*E\n"})
public final class IntentExtKt {
    @Nullable
    public static final List<byte[]> getByteArraysExtra(@NotNull Intent intent, @NotNull String name) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Bundle bundleExtra = intent.getBundleExtra(name);
        if (bundleExtra == null) {
            return null;
        }
        int size = bundleExtra.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            byte[] byteArray = bundleExtra.getByteArray(String.valueOf(i));
            if (byteArray == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(byteArray, "requireNotNull(bundle.ge…eArray(index.toString()))");
            arrayList.add(byteArray);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T extends a<?, ?>> List<T> getProtoMessages(@NotNull Intent intent, @NotNull String name, @NotNull Function1<? super byte[], ? extends T> parser) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parser, "parser");
        List<byte[]> byteArraysExtra = getByteArraysExtra(intent, name);
        if (byteArraysExtra == null) {
            return null;
        }
        List<byte[]> list = byteArraysExtra;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(parser.invoke2(it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final Intent putByteArraysExtra(@NotNull Intent intent, @NotNull String name, @NotNull Collection<byte[]> byteArrays) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(byteArrays, "byteArrays");
        Bundle bundle = new Bundle(byteArrays.size());
        int i = 0;
        for (Object obj : byteArrays) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            bundle.putByteArray(String.valueOf(i), (byte[]) obj);
            i = i2;
        }
        Unit unit = Unit.INSTANCE;
        Intent intentPutExtra = intent.putExtra(name, bundle);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(\n        name,\n…       }\n        },\n    )");
        return intentPutExtra;
    }

    @NotNull
    public static final Intent putProtoMessages(@NotNull Intent intent, @NotNull String name, @NotNull Collection<? extends a<?, ?>> messages) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Collection<? extends a<?, ?>> collection = messages;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).toByteArray());
        }
        return putByteArraysExtra(intent, name, arrayList);
    }
}
