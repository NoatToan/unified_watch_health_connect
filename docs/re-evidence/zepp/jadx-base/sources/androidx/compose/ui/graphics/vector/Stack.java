package androidx.compose.ui.graphics.vector;

import androidx.exifinterface.media.ExifInterface;
import com.huami.message.utils.MessageRecorderEventHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B$\u0012\u0018\b\u0002\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010\u0006R&\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0013\u0010&\u001a\u00020\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010\u001cø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/graphics/vector/Stack;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "", "push-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "pop-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "peek-impl", "peek", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "", "clear-impl", "(Ljava/util/ArrayList;)V", "clear", "", "toString-impl", "(Ljava/util/ArrayList;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/ArrayList;)I", "hashCode", "other", "equals-impl", "equals", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "backing", "Ljava/util/ArrayList;", "getSize-impl", "size", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "ui_release"}, k = 1, mv = {1, 5, 1})
@JvmInline
final class Stack<T> {

    @NotNull
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m1689boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m1690clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m1691constructorimpl(@NotNull ArrayList<T> arrayList) {
        return arrayList;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m1692constructorimpl$default(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m1691constructorimpl(arrayList);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1693equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && Intrinsics.areEqual(arrayList, ((Stack) obj).getBacking());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1694equalsimpl0(ArrayList<?> arrayList, ArrayList<?> arrayList2) {
        return Intrinsics.areEqual(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m1695getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1696hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1697isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m1698isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m1697isEmptyimpl(arrayList);
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m1699peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m1695getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: pop-impl, reason: not valid java name */
    public static final T m1700popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m1695getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: push-impl, reason: not valid java name */
    public static final boolean m1701pushimpl(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1702toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m1693equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m1696hashCodeimpl(this.backing);
    }

    public String toString() {
        return m1702toStringimpl(this.backing);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ ArrayList getBacking() {
        return this.backing;
    }
}
