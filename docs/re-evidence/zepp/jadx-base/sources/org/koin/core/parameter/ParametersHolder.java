package org.koin.core.parameter;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.notification.TransportUri;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.error.NoParameterFoundException;
import org.koin.ext.KClassExtKt;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!¢\u0006\u0004\b,\u0010-J)\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\n¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\n¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\n¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\r\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\n¢\u0006\u0004\b\r\u0010\nJ\u0018\u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\n¢\u0006\u0004\b\u000e\u0010\nJ\u001e\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0001J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0001J\u001c\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\nJ#\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b¢\u0006\u0004\b\u001d\u0010\nJ\b\u0010 \u001a\u00020\u001fH\u0016R*\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010%¨\u0006/"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "i", "Lkotlin/reflect/KClass;", "clazz", "elementAt", "(ILkotlin/reflect/KClass;)Ljava/lang/Object;", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "get", "(I)Ljava/lang/Object;", "t", "", WatchFaceArrivingEvent.CMD_SET, "(ILjava/lang/Object;)V", "size", "", "isEmpty", "isNotEmpty", "index", "value", Constant.METHOD_INSERT, TransportUri.ACTION_ADD, "getOrNull", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "", "a", "Ljava/util/List;", "get_values", "()Ljava/util/List;", "get_values$annotations", "()V", "_values", "", "getValues", "values", "<init>", "(Ljava/util/List;)V", "Companion", "koin-core"}, k = 1, mv = {1, 5, 1})
public class ParametersHolder {
    public static final int MAX_PARAMS = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Object> _values;

    /* JADX WARN: Multi-variable type inference failed */
    public ParametersHolder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ParametersHolder(@NotNull List<Object> list) {
        this._values = list;
    }

    @PublishedApi
    public static /* synthetic */ void get_values$annotations() {
    }

    @NotNull
    public final ParametersHolder add(@NotNull Object value) {
        this._values.add(value);
        return this;
    }

    public final /* synthetic */ <T> T component1() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(0, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component2() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(1, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component3() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(2, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component4() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(3, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component5() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(4, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public <T> T elementAt(int i, @NotNull KClass<?> clazz) throws NoParameterFoundException {
        if (this._values.size() > i) {
            return (T) this._values.get(i);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i + " from " + this + " for type '" + KClassExtKt.getFullName(clazz) + '\'');
    }

    public final <T> T get(int i) {
        return (T) this._values.get(i);
    }

    @Nullable
    public <T> T getOrNull(@NotNull KClass<?> clazz) {
        T t;
        Iterator<T> it2 = this._values.iterator();
        do {
            t = null;
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (clazz.isInstance(next)) {
                t = next;
            }
        } while (t == null);
        return t;
    }

    @NotNull
    public final List<Object> getValues() {
        return this._values;
    }

    @NotNull
    public final List<Object> get_values() {
        return this._values;
    }

    @NotNull
    public final ParametersHolder insert(int index, @NotNull Object value) {
        this._values.add(index, value);
        return this;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final <T> void set(int i, T t) {
        List<Object> list = this._values;
        Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.Any");
        list.set(i, t);
    }

    public final int size() {
        return this._values.size();
    }

    @NotNull
    public String toString() {
        return Intrinsics.stringPlus("DefinitionParameters", CollectionsKt___CollectionsKt.toList(this._values));
    }

    public final /* synthetic */ <T> T get() throws DefinitionParameterException {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) getOrNull(Reflection.getOrCreateKotlinClass(Object.class));
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No value found for type '");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)));
        sb.append('\'');
        throw new DefinitionParameterException(sb.toString());
    }

    public final /* synthetic */ <T> T getOrNull() {
        T t;
        Iterator<T> it2 = get_values().iterator();
        do {
            t = null;
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (next instanceof Object) {
                t = next;
            }
        } while (t == null);
        return t;
    }

    public /* synthetic */ ParametersHolder(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
