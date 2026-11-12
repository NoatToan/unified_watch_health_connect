package com.xiaomi.fitness.common.extensions;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.databinding.ObservableArrayList;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\b\u001a$\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a%\u0010\u000b\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\f\u001a.\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003\u001aK\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u0011*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u0001H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0014¢\u0006\u0002\u0010\u0015\u001aK\u0010\u0016\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u0011*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u0001H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0014¢\u0006\u0002\u0010\u0015\u001a \u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0018\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003\u001a4\u0010\u0019\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u001a*\b\u0012\u0004\u0012\u0002H\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0014H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"add", "", "T", "", "element", "(Ljava/util/List;Ljava/lang/Object;)V", "index", "", "(Ljava/util/List;ILjava/lang/Object;)V", "addAll", "elements", "remove", "(Ljava/util/List;I)Ljava/lang/Object;", "newObservable", "Landroidx/databinding/ObservableArrayList;", "maxOfOrDefault", "R", "", "def", "selector", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/Comparable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "minOfOrDefault", "toArrayList", "Ljava/util/ArrayList;", "forEach", "Landroid/os/IInterface;", "Landroid/os/RemoteCallbackList;", "action", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1863#2,2:109\n*S KotlinDebug\n*F\n+ 1 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n81#1:109,2\n*E\n"})
public final class ListExtKt {
    public static final <T> void add(@NotNull List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        add(list, list.size(), t);
    }

    public static final <T> void addAll(@NotNull List<? extends T> list, @NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (TypeIntrinsics.isMutableList(list)) {
            list.addAll(elements);
        } else if (list instanceof LinkedList) {
            ((LinkedList) list).addAll(elements);
        } else if (list instanceof ObservableArrayList) {
            ((ObservableArrayList) list).addAll(elements);
        }
    }

    public static final <T extends IInterface> void forEach(@NotNull RemoteCallbackList<T> remoteCallbackList, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(remoteCallbackList, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    action.invoke2(broadcastItem);
                } catch (Exception e) {
                    Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                }
            }
            InlineMarker.finallyStart(1);
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e2) {
                e = e2;
                Logger.e("An exception occurred when finishBroadcast", e);
            }
        } catch (Exception e3) {
            Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
            InlineMarker.finallyStart(1);
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                e = e4;
                Logger.e("An exception occurred when finishBroadcast", e);
            }
        } finally {
            InlineMarker.finallyStart(1);
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e5) {
                Logger.e("An exception occurred when finishBroadcast", e5);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> R maxOfOrDefault(@NotNull List<? extends T> list, @Nullable R r2, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return r2;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke2(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke2(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> R minOfOrDefault(@NotNull List<? extends T> list, @Nullable R r2, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return r2;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke2(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke2(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final <T> ObservableArrayList<T> newObservable(@NotNull List<? extends T> list, @Nullable List<? extends T> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ObservableArrayList<T> observableArrayList = new ObservableArrayList<>();
        if (list2 != null) {
            observableArrayList.addAll(list2);
        } else {
            observableArrayList.addAll(list);
        }
        return observableArrayList;
    }

    public static /* synthetic */ ObservableArrayList newObservable$default(List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list2 = null;
        }
        return newObservable(list, list2);
    }

    @Nullable
    public static final <T> T remove(@NotNull List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (TypeIntrinsics.isMutableList(list)) {
            return list.remove(i);
        }
        if (list instanceof LinkedList) {
            return (T) ((LinkedList) list).remove(i);
        }
        if (list instanceof ObservableArrayList) {
            return (T) ((ObservableArrayList) list).remove(i);
        }
        return null;
    }

    @Nullable
    public static final <T> ArrayList<T> toArrayList(@Nullable List<? extends T> list) {
        if (list == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void add(@NotNull List<? extends T> list, int i, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (TypeIntrinsics.isMutableList(list)) {
            list.add(i, t);
        } else if (list instanceof LinkedList) {
            ((LinkedList) list).add(i, t);
        } else if (list instanceof ObservableArrayList) {
            ((ObservableArrayList) list).add(i, t);
        }
    }
}
