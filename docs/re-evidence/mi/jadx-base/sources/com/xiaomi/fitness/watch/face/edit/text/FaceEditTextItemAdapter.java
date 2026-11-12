package com.xiaomi.fitness.watch.face.edit.text;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.utils.ItemDragHelperCallBack;
import com.xiaomi.fitness.baseui.utils.OnItemDragListener;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceDragHelper;
import com.xiaomi.fitness.watch.face.edit.text.FaceEditTextItemAdapter;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import defpackage.fhi;
import defpackage.iki;
import defpackage.isi;
import defpackage.l29;
import defpackage.noi;
import defpackage.p29;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004;<=:B3\u0012\"\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\u00050\u001aj\u0002`\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b8\u00109J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\u00050\u001aj\u0002`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "", "handleScrollToVisible", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextListData;", "data", "setStringList", "(Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextListData;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "", "", "Lcom/xiaomi/fitness/watch/face/edit/text/OnTextChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function2;", "Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextDragListener;", "dragListener", "Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextDragListener;", "", "Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$EditTextItemState;", "stringList", "Ljava/util/List;", "originTextList", "textEditItem", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "maxStringCount", "I", "", "weekDays", "[Ljava/lang/String;", "Lcom/xiaomi/fitness/baseui/utils/ItemDragHelperCallBack;", "itemTouchHelperCallback", "Lcom/xiaomi/fitness/baseui/utils/ItemDragHelperCallBack;", "getItemTouchHelperCallback", "()Lcom/xiaomi/fitness/baseui/utils/ItemDragHelperCallBack;", "getEditTextList", "()Ljava/util/List;", "editTextList", "<init>", "(Lkotlin/jvm/functions/Function2;Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextDragListener;)V", "Companion", "FaceEditTextItemViewHolder", "FaceEditTextAddItemViewHolder", "EditTextItemState", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceEditTextItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditTextItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,478:1\n774#2:479\n865#2,2:480\n1557#2:482\n1628#2,3:483\n1863#2,2:486\n1782#2,4:488\n*S KotlinDebug\n*F\n+ 1 FaceEditTextItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter\n*L\n56#1:479\n56#1:480,2\n56#1:482\n56#1:483,3\n64#1:486,2\n75#1:488,4\n*E\n"})
public final class FaceEditTextItemAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    private static final int MAX_COUNT = 10;
    private static final int MIN_COUNT = 1;
    private static final int TYPE_ITEM_ADD = 2;
    private static final int TYPE_ITEM_DATA_SOURCE = 3;
    private static final int TYPE_ITEM_TEXT = 1;

    @NotNull
    private final FaceEditTextDragListener dragListener;

    @NotNull
    private final ItemDragHelperCallBack itemTouchHelperCallback;

    @NotNull
    private final Function2<FaceEditLiteralBean, List<String>, Unit> listener;
    private int maxStringCount;

    @NotNull
    private final List<String> originTextList;

    @NotNull
    private final List<EditTextItemState> stringList;

    @Nullable
    private FaceEditLiteralBean textEditItem;

    @NotNull
    private final String[] weekDays;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$EditTextItemState;", "", "text", "", "state", "", "<init>", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getState", "()I", "setState", "(I)V", "isOne", "", "()Z", "isMore", "isEditText", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditTextItemState {
        public static final int STATE_ADD = 3;
        public static final int STATE_LOCK = 1;
        public static final int STATE_MORE = 2;
        private int state;

        @NotNull
        private String text;

        public EditTextItemState(@NotNull String text, int i) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.state = i;
        }

        public static /* synthetic */ EditTextItemState copy$default(EditTextItemState editTextItemState, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = editTextItemState.text;
            }
            if ((i2 & 2) != 0) {
                i = editTextItemState.state;
            }
            return editTextItemState.copy(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getState() {
            return this.state;
        }

        @NotNull
        public final EditTextItemState copy(@NotNull String text, int state) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new EditTextItemState(text, state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditTextItemState)) {
                return false;
            }
            EditTextItemState editTextItemState = (EditTextItemState) other;
            return Intrinsics.areEqual(this.text, editTextItemState.text) && this.state == editTextItemState.state;
        }

        public final int getState() {
            return this.state;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Integer.hashCode(this.state);
        }

        public final boolean isEditText() {
            int i = this.state;
            return i == 1 || i == 2;
        }

        public final boolean isMore() {
            return this.state == 2;
        }

        public final boolean isOne() {
            return this.state == 1;
        }

        public final void setState(int i) {
            this.state = i;
        }

        public final void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        @NotNull
        public String toString() {
            return "EditTextItemState(text=" + this.text + ", state=" + this.state + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$FaceEditTextAddItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "onClick", "()V", "Ll29;", "binding", "Ll29;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter;Ll29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceEditTextItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditTextItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$FaceEditTextAddItemViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,478:1\n388#2,7:479\n*S KotlinDebug\n*F\n+ 1 FaceEditTextItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$FaceEditTextAddItemViewHolder\n*L\n299#1:479,7\n*E\n"})
    public final class FaceEditTextAddItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final l29 binding;
        final /* synthetic */ FaceEditTextItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditTextAddItemViewHolder(@NotNull FaceEditTextItemAdapter faceEditTextItemAdapter, l29 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditTextItemAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$1(FaceEditTextItemAdapter this$0, View view) {
            int iNextIndex;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int size = this$0.stringList.size() - 1;
            if (size == 0) {
                this$0.stringList.add(size, new EditTextItemState("", 1));
                this$0.notifyItemInserted(size);
            } else if (1 > size || size >= 2) {
                this$0.stringList.add(size, new EditTextItemState("", 2));
                this$0.notifyItemInserted(size);
                if (size == 9) {
                    this$0.stringList.remove(this$0.stringList.size() - 1);
                    this$0.notifyItemRemoved(this$0.stringList.size() - 1);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    ((EditTextItemState) this$0.stringList.get(i)).setState(2);
                    this$0.notifyItemChanged(i);
                }
                this$0.stringList.add(size, new EditTextItemState("", 2));
                this$0.notifyItemInserted(size);
            }
            FaceEditLiteralBean faceEditLiteralBean = this$0.textEditItem;
            if (faceEditLiteralBean != null) {
                List list = this$0.stringList;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((EditTextItemState) listIterator.previous()).isEditText()) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                faceEditLiteralBean.setShow(iNextIndex);
            }
            Function2 function2 = this$0.listener;
            FaceEditLiteralBean faceEditLiteralBean2 = this$0.textEditItem;
            Intrinsics.checkNotNull(faceEditLiteralBean2);
            function2.invoke(faceEditLiteralBean2, this$0.getEditTextList());
        }

        public final void onClick() {
            View root = this.binding.getRoot();
            final FaceEditTextItemAdapter faceEditTextItemAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: pv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditTextItemAdapter.FaceEditTextAddItemViewHolder.onClick$lambda$1(faceEditTextItemAdapter, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$FaceEditTextItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "handleInputOnHarmonyOs", "()V", "onBind", "Lp29;", "binding", "Lp29;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter;Lp29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceEditTextItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditTextItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$FaceEditTextItemViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,478:1\n1782#2,4:479\n1782#2,4:483\n1872#2,3:487\n388#2,7:490\n774#2:497\n865#2,2:498\n1557#2:500\n1628#2,3:501\n*S KotlinDebug\n*F\n+ 1 FaceEditTextItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter$FaceEditTextItemViewHolder\n*L\n163#1:479,4\n167#1:483,4\n169#1:487,3\n175#1:490,7\n178#1:497\n178#1:498,2\n178#1:500\n178#1:501,3\n*E\n"})
    public final class FaceEditTextItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final p29 binding;
        final /* synthetic */ FaceEditTextItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditTextItemViewHolder(@NotNull FaceEditTextItemAdapter faceEditTextItemAdapter, p29 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditTextItemAdapter;
            this.binding = binding;
        }

        private final void handleInputOnHarmonyOs() {
            if (!RomUtils.INSTANCE.isHarmonyOs() || getBindingAdapterPosition() < 5) {
                return;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final FaceEditTextItemAdapter faceEditTextItemAdapter = this.this$0;
            handler.postDelayed(new Runnable() { // from class: uv8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceEditTextItemAdapter.FaceEditTextItemViewHolder.handleInputOnHarmonyOs$lambda$10(faceEditTextItemAdapter, this);
                }
            }, 500L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleInputOnHarmonyOs$lambda$10(FaceEditTextItemAdapter this$0, FaceEditTextItemViewHolder this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            View itemView = this$1.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            this$0.handleScrollToVisible(itemView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:69:0x00d5 A[SYNTHETIC] */
        public static final void onBind$lambda$6(FaceEditTextItemViewHolder this$0, FaceEditTextItemAdapter this$1, View view) {
            int i;
            int i2;
            EditTextItemState editTextItemState;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            int iNextIndex = -1;
            if (this$0.getBindingAdapterPosition() == -1) {
                return;
            }
            this$1.stringList.remove(this$0.getBindingAdapterPosition());
            this$1.notifyItemRemoved(this$0.getBindingAdapterPosition());
            List list = this$1.stringList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (((EditTextItemState) it.next()).isEditText() && (i3 = i3 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                if (i3 == 9) {
                    this$1.stringList.add(new EditTextItemState("", 3));
                    this$1.notifyItemInserted(this$1.stringList.size() - 1);
                }
            }
            List list2 = this$1.stringList;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
                i2 = 0;
                for (Object obj : this$1.stringList) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    editTextItemState = (EditTextItemState) obj;
                    if (editTextItemState.isMore()) {
                        editTextItemState.setState(1);
                    }
                    i = i2;
                    i2 = i4;
                }
                this$1.notifyItemRangeChanged(0, i);
            } else {
                Iterator it2 = list2.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    if (((EditTextItemState) it2.next()).isEditText() && (i5 = i5 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                if (i5 <= 1) {
                    i = 0;
                    i2 = 0;
                    while (r6.hasNext()) {
                        int i6 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        editTextItemState = (EditTextItemState) obj;
                        if (editTextItemState.isMore()) {
                            editTextItemState.setState(1);
                        }
                        i = i2;
                        i2 = i6;
                    }
                    this$1.notifyItemRangeChanged(0, i);
                }
            }
            FaceEditLiteralBean faceEditLiteralBean = this$1.textEditItem;
            if (faceEditLiteralBean != null) {
                List list3 = this$1.stringList;
                ListIterator listIterator = list3.listIterator(list3.size());
                while (listIterator.hasPrevious()) {
                    if (((EditTextItemState) listIterator.previous()).isEditText()) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                faceEditLiteralBean.setShow(iNextIndex);
            }
            Function2 function2 = this$1.listener;
            FaceEditLiteralBean faceEditLiteralBean2 = this$1.textEditItem;
            Intrinsics.checkNotNull(faceEditLiteralBean2);
            List list4 = this$1.stringList;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list4) {
                if (((EditTextItemState) obj2).isEditText()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((EditTextItemState) it3.next()).getText());
            }
            function2.invoke(faceEditLiteralBean2, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onBind$lambda$7(FaceEditTextItemAdapter this$0, FaceEditTextItemViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.dragListener.startDragItem(this$1);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBind$lambda$8(FaceEditTextItemAdapter this$0, FaceEditTextItemViewHolder this$1, FaceEditTextItemAdapter$FaceEditTextItemViewHolder$onBind$editTextWatcher$1 editTextWatcher, boolean z, View view, boolean z2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(editTextWatcher, "$editTextWatcher");
            if (!z2) {
                this$1.binding.D.removeTextChangedListener(editTextWatcher);
                if (z) {
                    this$1.binding.getRoot().setBackgroundResource(noi.e);
                    return;
                }
                return;
            }
            FaceEditLiteralBean faceEditLiteralBean = this$0.textEditItem;
            if (faceEditLiteralBean != null) {
                faceEditLiteralBean.setShow(this$1.getBindingAdapterPosition());
            }
            Function2 function2 = this$0.listener;
            FaceEditLiteralBean faceEditLiteralBean2 = this$0.textEditItem;
            Intrinsics.checkNotNull(faceEditLiteralBean2);
            function2.invoke(faceEditLiteralBean2, this$0.getEditTextList());
            this$1.binding.D.addTextChangedListener(editTextWatcher);
            if (z) {
                this$1.binding.getRoot().setBackgroundResource(noi.d);
            }
            this$1.handleInputOnHarmonyOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onBind$lambda$9(FaceEditTextItemViewHolder this$0, View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (motionEvent.getAction() != 1 || !view.hasFocus()) {
                return false;
            }
            this$0.handleInputOnHarmonyOs();
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [android.text.TextWatcher, com.xiaomi.fitness.watch.face.edit.text.FaceEditTextItemAdapter$FaceEditTextItemViewHolder$onBind$editTextWatcher$1, java.lang.Object] */
        public final void onBind() {
            Application application;
            int i;
            Object tag = this.binding.D.getTag();
            this.binding.D.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
            FaceEditLiteralBean faceEditLiteralBean = this.this$0.textEditItem;
            String source = faceEditLiteralBean != null ? faceEditLiteralBean.getSource() : null;
            final boolean z = !(source == null || source.length() == 0);
            if (z) {
                this.binding.D.setBackgroundColor(0);
                this.binding.getRoot().setBackgroundResource(noi.c);
                TextView weekDay = this.binding.F;
                Intrinsics.checkNotNullExpressionValue(weekDay, "weekDay");
                ExtUtilsKt.setVisible(weekDay, true);
                View divider = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(divider, "divider");
                ExtUtilsKt.setVisible(divider, true);
                if (this.this$0.weekDays.length > getBindingAdapterPosition()) {
                    this.binding.F.setText(this.this$0.weekDays[getBindingAdapterPosition()]);
                }
            }
            InputFilter inputFilter = new InputFilter() { // from class: com.xiaomi.fitness.watch.face.edit.text.FaceEditTextItemAdapter$FaceEditTextItemViewHolder$onBind$emojiFilter$1
                private Pattern emoji;

                {
                    Pattern patternCompile = Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[☀-⟿]", 66);
                    Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
                    this.emoji = patternCompile;
                }

                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence source2, int start, int end, Spanned dest, int dstart, int dend) {
                    Intrinsics.checkNotNullParameter(source2, "source");
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Matcher matcher = this.emoji.matcher(source2);
                    Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                    return matcher.find() ? "" : source2;
                }

                public final Pattern getEmoji() {
                    return this.emoji;
                }

                public final void setEmoji(Pattern pattern) {
                    Intrinsics.checkNotNullParameter(pattern, "<set-?>");
                    this.emoji = pattern;
                }
            };
            final FaceEditTextItemAdapter faceEditTextItemAdapter = this.this$0;
            final ?? r5 = new TextWatcher() { // from class: com.xiaomi.fitness.watch.face.edit.text.FaceEditTextItemAdapter$FaceEditTextItemViewHolder$onBind$editTextWatcher$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    String str = (String) CollectionsKt___CollectionsKt.getOrNull(faceEditTextItemAdapter.originTextList, this.getBindingAdapterPosition());
                    String strValueOf = String.valueOf(s);
                    if (!Intrinsics.areEqual(strValueOf, str) && this.binding.D.hasFocus()) {
                        this.binding.D.setTextColor(ApplicationExtKt.getApplication().getColor(iki.n));
                    }
                    ((FaceEditTextItemAdapter.EditTextItemState) faceEditTextItemAdapter.stringList.get(this.getBindingAdapterPosition())).setText(strValueOf);
                    Function2 function2 = faceEditTextItemAdapter.listener;
                    FaceEditLiteralBean faceEditLiteralBean2 = faceEditTextItemAdapter.textEditItem;
                    Intrinsics.checkNotNull(faceEditLiteralBean2);
                    function2.invoke(faceEditLiteralBean2, faceEditTextItemAdapter.getEditTextList());
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }
            };
            FaceEditLiteralBean faceEditLiteralBean2 = this.this$0.textEditItem;
            Intrinsics.checkNotNull(faceEditLiteralBean2);
            if (faceEditLiteralBean2.getShow() == getBindingAdapterPosition()) {
                this.binding.D.requestFocus();
            } else {
                this.binding.D.clearFocus();
            }
            EditTextItemState editTextItemState = (EditTextItemState) this.this$0.stringList.get(getBindingAdapterPosition());
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.this$0.originTextList, getBindingAdapterPosition());
            EditText editText = this.binding.D;
            if (Intrinsics.areEqual(editTextItemState.getText(), str)) {
                application = ApplicationExtKt.getApplication();
                i = iki.f21258k;
            } else {
                application = ApplicationExtKt.getApplication();
                i = iki.n;
            }
            editText.setTextColor(application.getColor(i));
            this.binding.D.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.this$0.maxStringCount), inputFilter});
            this.binding.D.setText(editTextItemState.getText());
            Group moreGroup = this.binding.E;
            Intrinsics.checkNotNullExpressionValue(moreGroup, "moreGroup");
            ViewExtKt.setVisible(moreGroup, editTextItemState.getState() == 2);
            ImageView imageView = this.binding.A;
            final FaceEditTextItemAdapter faceEditTextItemAdapter2 = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: qv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditTextItemAdapter.FaceEditTextItemViewHolder.onBind$lambda$6(this.f31877a, faceEditTextItemAdapter2, view);
                }
            });
            ImageView imageView2 = this.binding.C;
            final FaceEditTextItemAdapter faceEditTextItemAdapter3 = this.this$0;
            imageView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: rv8
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return FaceEditTextItemAdapter.FaceEditTextItemViewHolder.onBind$lambda$7(faceEditTextItemAdapter3, this, view);
                }
            });
            if (this.binding.D.hasFocus()) {
                this.binding.D.addTextChangedListener(r5);
            }
            EditText editText2 = this.binding.D;
            final FaceEditTextItemAdapter faceEditTextItemAdapter4 = this.this$0;
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sv8
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) {
                    FaceEditTextItemAdapter.FaceEditTextItemViewHolder.onBind$lambda$8(faceEditTextItemAdapter4, this, r5, z, view, z2);
                }
            });
            if (RomUtils.INSTANCE.isHarmonyOs() && getBindingAdapterPosition() >= 5) {
                this.binding.D.setOnTouchListener(new View.OnTouchListener() { // from class: tv8
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return FaceEditTextItemAdapter.FaceEditTextItemViewHolder.onBind$lambda$9(this.f35100a, view, motionEvent);
                    }
                });
            }
            this.binding.D.setTag(r5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.xiaomi.fitness.watch.face.edit.text.FaceEditTextItemAdapter$itemTouchHelperCallback$2] */
    public FaceEditTextItemAdapter(@NotNull Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> listener, @NotNull FaceEditTextDragListener dragListener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(dragListener, "dragListener");
        this.listener = listener;
        this.dragListener = dragListener;
        this.stringList = new ArrayList();
        this.originTextList = new ArrayList();
        this.weekDays = ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), fhi.f17788b);
        final ?? r2 = new OnItemDragListener() { // from class: com.xiaomi.fitness.watch.face.edit.text.FaceEditTextItemAdapter$itemTouchHelperCallback$2
            private final void handleEdgeScrolling(RecyclerView recyclerView, View itemView, float dY) {
                ViewParent parent = recyclerView.getParent();
                while (parent != null && !(parent instanceof NestedScrollView)) {
                    parent = parent.getParent();
                }
                if (parent == null) {
                    return;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) parent;
                int[] iArr = new int[2];
                nestedScrollView.getLocationOnScreen(iArr);
                recyclerView.getLocationOnScreen(new int[2]);
                int[] iArr2 = new int[2];
                itemView.getLocationOnScreen(iArr2);
                float f = iArr2[1] + dY;
                float bottom = itemView.getBottom() + dY;
                float height = itemView.getHeight() + f + dY;
                int scrollY = nestedScrollView.getScrollY();
                int height2 = nestedScrollView.getHeight();
                StringBuilder sb = new StringBuilder();
                sb.append("scrollX=");
                sb.append(scrollY);
                sb.append(", itemTop=");
                sb.append(f);
                sb.append(",bottom=");
                sb.append(height);
                sb.append(",recyclerTop: 0,bottom=");
                sb.append(height2);
                sb.append(",dy=");
                sb.append(dY);
                if (f < iArr[1] + 100 && dY < 0.0f) {
                    scrollNestedScrollView(nestedScrollView, -15);
                } else {
                    if (height <= FaceDragHelper.INSTANCE.getButtonTop() - 100 || bottom >= recyclerView.getBottom() || dY <= 0.0f) {
                        return;
                    }
                    scrollNestedScrollView(nestedScrollView, 15);
                }
            }

            private final void scrollNestedScrollView(NestedScrollView recyclerView, int dy) {
                recyclerView.smoothScrollBy(0, dy);
            }

            @Override // com.xiaomi.fitness.baseui.utils.OnItemDragListener
            public void onItemMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, float y, float dY, boolean isCurrentlyActive) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    EditText editText = (EditText) recyclerView.getChildAt(i).findViewById(isi.a0);
                    if (editText != null) {
                        editText.clearFocus();
                    }
                }
                FaceEditLiteralBean faceEditLiteralBean = this.this$0.textEditItem;
                if (faceEditLiteralBean != null) {
                    faceEditLiteralBean.setShow(-1);
                }
                if (isCurrentlyActive) {
                    View itemView = viewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    handleEdgeScrolling(recyclerView, itemView, dY);
                }
            }

            @Override // com.xiaomi.fitness.baseui.utils.OnItemDragListener
            public void onItemSwap(RecyclerView recyclerView, int from, int to) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (from >= to) {
                    int i = to + 1;
                    if (i <= from) {
                        int i2 = from;
                        while (true) {
                            Collections.swap(this.this$0.stringList, i2, i2 - 1);
                            if (i2 == i) {
                                break;
                            } else {
                                i2--;
                            }
                        }
                    }
                } else {
                    int i3 = from;
                    while (i3 < to) {
                        int i4 = i3 + 1;
                        Collections.swap(this.this$0.stringList, i3, i4);
                        i3 = i4;
                    }
                }
                this.this$0.notifyItemMoved(from, to);
            }
        };
        this.itemTouchHelperCallback = new ItemDragHelperCallBack(r2) { // from class: com.xiaomi.fitness.watch.face.edit.text.FaceEditTextItemAdapter$itemTouchHelperCallback$1
            @Override // androidx.recyclerview.widget.l.e
            public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 current, RecyclerView.d0 target) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(current, "current");
                Intrinsics.checkNotNullParameter(target, "target");
                return ((FaceEditTextItemAdapter.EditTextItemState) this.this$0.stringList.get(current.getBindingAdapterPosition())).isEditText() && ((FaceEditTextItemAdapter.EditTextItemState) this.this$0.stringList.get(target.getBindingAdapterPosition())).isEditText();
            }

            @Override // androidx.recyclerview.widget.l.e
            public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                super.clearView(recyclerView, viewHolder);
                this.this$0.dragListener.onDragOver();
                Function2 function2 = this.this$0.listener;
                FaceEditLiteralBean faceEditLiteralBean = this.this$0.textEditItem;
                Intrinsics.checkNotNull(faceEditLiteralBean);
                function2.invoke(faceEditLiteralBean, this.this$0.getEditTextList());
                this.this$0.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean isLongPressDragEnabled() {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getEditTextList() {
        List<EditTextItemState> list = this.stringList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EditTextItemState) obj).isEditText()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EditTextItemState) it.next()).getText());
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScrollToVisible(View itemView) {
        ViewParent parent = itemView.getParent();
        if (parent instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) parent;
            ViewParent parent2 = recyclerView.getParent();
            while (parent2 != null && !(parent2 instanceof NestedScrollView)) {
                parent2 = parent2.getParent();
            }
            if (parent2 == null) {
                return;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) parent2;
            int[] iArr = new int[2];
            nestedScrollView.getLocationOnScreen(iArr);
            recyclerView.getLocationOnScreen(new int[2]);
            int[] iArr2 = new int[2];
            itemView.getLocationOnScreen(iArr2);
            int i = iArr2[1];
            Logger.i("scroll", "scroll " + ArraysKt___ArraysKt.toList(iArr) + " " + ArraysKt___ArraysKt.toList(iArr2) + " " + (iArr[1] - i));
            nestedScrollView.scrollBy(0, Math.abs(iArr[1] - i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.stringList.size();
    }

    @NotNull
    public final ItemDragHelperCallBack getItemTouchHelperCallback() {
        return this.itemTouchHelperCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int state = this.stringList.get(position).getState();
        return (state == 1 || state == 2 || state != 3) ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof FaceEditTextItemViewHolder) {
            ((FaceEditTextItemViewHolder) holder).onBind();
        } else if (holder instanceof FaceEditTextAddItemViewHolder) {
            ((FaceEditTextAddItemViewHolder) holder).onClick();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 2) {
            l29 l29VarA0 = l29.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(l29VarA0, "inflate(...)");
            return new FaceEditTextAddItemViewHolder(this, l29VarA0);
        }
        p29 p29VarA0 = p29.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(p29VarA0, "inflate(...)");
        return new FaceEditTextItemViewHolder(this, p29VarA0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    public final void setStringList(@NotNull FaceEditTextListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.stringList.clear();
        int i = 0;
        FaceEditLiteralBean faceEditLiteralBean = data.getTextEditBeanList().get(0);
        this.textEditItem = faceEditLiteralBean;
        String source = faceEditLiteralBean != null ? faceEditLiteralBean.getSource() : null;
        boolean z = !(source == null || source.length() == 0);
        int size = data.getTextList().size();
        FaceEditLiteralBean faceEditLiteralBean2 = this.textEditItem;
        Intrinsics.checkNotNull(faceEditLiteralBean2);
        this.maxStringCount = faceEditLiteralBean2.getMaxStringCount();
        Iterator<T> it = data.getTextList().iterator();
        while (it.hasNext()) {
            this.stringList.add(new EditTextItemState((String) it.next(), (size <= 1 || z) ? 1 : 2));
        }
        if (this.originTextList.isEmpty()) {
            List<String> list = this.originTextList;
            FaceEditLiteralBean faceEditLiteralBean3 = this.textEditItem;
            Intrinsics.checkNotNull(faceEditLiteralBean3);
            list.addAll(faceEditLiteralBean3.getDefaultTextList());
        }
        if (!z) {
            List<EditTextItemState> list2 = this.stringList;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                this.stringList.add(new EditTextItemState("", 3));
            } else {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((EditTextItemState) it2.next()).isEditText() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                if (i < 10) {
                    this.stringList.add(new EditTextItemState("", 3));
                }
            }
        }
        notifyDataSetChanged();
    }
}
