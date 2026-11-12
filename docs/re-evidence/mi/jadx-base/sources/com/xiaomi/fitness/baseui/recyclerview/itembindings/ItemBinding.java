package com.xiaomi.fitness.baseui.recyclerview.itembindings;

import android.util.SparseArray;
import androidx.databinding.ViewDataBinding;
import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.fitness.baseui.Utils;
import com.xiaomi.fitness.baseui.ViewCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#B\u0019\b\u0002\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0086\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\"R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "T", "Lcom/xiaomi/fitness/baseui/ViewCreator;", "onItemBind", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBind;", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBind;)V", "variableId", "", "getVariableId", "()I", "setVariableId", "(I)V", "layoutRes", "extraBindings", "Landroid/util/SparseArray;", "", "layoutId", "getLayoutId", CourseConfigModel.DevCmd.CMD_ACTION_SET, "bindExtra", "value", "clearExtras", "removeExtra", "extraBinding", "", "position", "item", "onItemBind$ui_release", "(ILjava/lang/Object;)V", "bind", "", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;)Z", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nItemBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemBinding.kt\ncom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
public final class ItemBinding<T> implements ViewCreator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int LAYOUT_NONE = 0;
    private static final int VAR_INVALID = -1;
    public static final int VAR_NONE = 0;

    @Nullable
    private SparseArray<Object> extraBindings;
    private int layoutRes;

    @Nullable
    private final OnItemBind<T> onItemBind;
    private int variableId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0001\u0010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding$Companion;", "", "<init>", "()V", "VAR_NONE", "", "VAR_INVALID", "LAYOUT_NONE", "of", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "T", "variableId", "layoutRes", "onItemBind", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBind;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> ItemBinding<T> of(int variableId, int layoutRes) {
            return new ItemBinding(null, 0 == true ? 1 : 0).set(variableId, layoutRes);
        }

        @NotNull
        public final <T> ItemBinding<T> of(@NotNull OnItemBind<T> onItemBind) {
            Intrinsics.checkNotNullParameter(onItemBind, "onItemBind");
            return new ItemBinding<>(onItemBind, null);
        }
    }

    public /* synthetic */ ItemBinding(OnItemBind onItemBind, DefaultConstructorMarker defaultConstructorMarker) {
        this(onItemBind);
    }

    public final boolean bind(@NotNull ViewDataBinding binding, T item) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        int i = this.variableId;
        if (i == 0) {
            return false;
        }
        if (!binding.q0(i, item)) {
            Utils.INSTANCE.throwMissingVariable(binding, this.variableId, this.layoutRes);
        }
        SparseArray<Object> sparseArray = this.extraBindings;
        if (sparseArray == null) {
            return true;
        }
        Intrinsics.checkNotNull(sparseArray);
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            SparseArray<Object> sparseArray2 = this.extraBindings;
            Intrinsics.checkNotNull(sparseArray2);
            int iKeyAt = sparseArray2.keyAt(i2);
            SparseArray<Object> sparseArray3 = this.extraBindings;
            Intrinsics.checkNotNull(sparseArray3);
            Object objValueAt = sparseArray3.valueAt(i2);
            if (iKeyAt != 0) {
                binding.q0(iKeyAt, objValueAt);
            }
        }
        return true;
    }

    @NotNull
    public final ItemBinding<T> bindExtra(int variableId, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.extraBindings == null) {
            this.extraBindings = new SparseArray<>(1);
        }
        SparseArray<Object> sparseArray = this.extraBindings;
        Intrinsics.checkNotNull(sparseArray);
        sparseArray.put(variableId, value);
        return this;
    }

    @NotNull
    public final ItemBinding<T> clearExtras() {
        SparseArray<Object> sparseArray = this.extraBindings;
        if (sparseArray != null) {
            Intrinsics.checkNotNull(sparseArray);
            sparseArray.clear();
        }
        return this;
    }

    @Nullable
    public final Object extraBinding(int variableId) {
        SparseArray<Object> sparseArray = this.extraBindings;
        if (sparseArray == null) {
            return null;
        }
        Intrinsics.checkNotNull(sparseArray);
        return sparseArray.get(variableId);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public int getLayoutRes() {
        return this.layoutRes;
    }

    public final int getVariableId() {
        return this.variableId;
    }

    public final void onItemBind$ui_release(int position, T item) {
        OnItemBind<T> onItemBind = this.onItemBind;
        if (onItemBind != null) {
            this.variableId = -1;
            this.layoutRes = 0;
            onItemBind.onItemBind(this, position, item);
            if (this.variableId == -1) {
                throw new IllegalStateException("variableId not set in onItemBind()".toString());
            }
            if (this.layoutRes == 0) {
                throw new IllegalStateException("layoutRes not set in onItemBind()".toString());
            }
        }
    }

    @NotNull
    public final ItemBinding<T> removeExtra(int variableId) {
        SparseArray<Object> sparseArray = this.extraBindings;
        if (sparseArray != null) {
            Intrinsics.checkNotNull(sparseArray);
            sparseArray.remove(variableId);
        }
        return this;
    }

    @NotNull
    public final ItemBinding<T> set(int variableId, int layoutRes) {
        this.variableId = variableId;
        this.layoutRes = layoutRes;
        return this;
    }

    public final void setVariableId(int i) {
        this.variableId = i;
    }

    private ItemBinding(OnItemBind<T> onItemBind) {
        this.onItemBind = onItemBind;
    }
}
