package com.xiaomi.hm.health.device.settings.todo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.device.settings.todo.TodoAdapter;
import com.xiaomi.hm.health.device.settings.todo.TodoAdapter.Item;
import com.xiaomi.hm.health.utils.ex.ViewExKt;
import com.xmlywind.sdk.common.Constants;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;
import com.zhouyou.recyclerview.divider.FlexibleDividerDecoration;
import com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 <*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u00020\u0005:\u0003=>?BQ\u0012\u0006\u00109\u001a\u000208\u0012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0'\u0012\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0+\u0012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0'¢\u0006\u0004\b:\u0010;J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002J \u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J&\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J.\u0010#\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J&\u0010&\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R*\u00104\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zhouyou/recyclerview/group/GroupedRecyclerViewAdapter;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Group;", "Lcom/zhouyou/recyclerview/divider/FlexibleDividerDecoration$VisibilityProvider;", "Landroid/widget/TextView;", "textView", "item", "", SOAP.XMLNS, "Landroid/view/View;", "editView", "deleteView", "", "isEditable", "t", "Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewHolder;", "holder", "m", "(Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewHolder;Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Item;)V", "", "position", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "shouldHideDivider", "getGroupCount", "groupPosition", "hasHeader", "viewType", "getHeaderLayout", "onBindHeaderViewHolder", "getChildrenCount", "getChildLayout", "childPosition", "onBindChildViewHolder", "getFooterLayout", "hasFooter", "onBindFooterViewHolder", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "onEdit", "Lkotlin/Function2;", "h", "Lkotlin/jvm/functions/Function2;", "onDone", "i", "onDelete", "enable", z.j, "Z", "isEditEnable", "()Z", "setEditEnable", "(Z)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", hl.k, "a", "Group", "Item", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoAdapter<T extends Item> extends GroupedRecyclerViewAdapter<Group<T>> implements FlexibleDividerDecoration.VisibilityProvider {

    @Deprecated
    public static final float DELETE_START_MARGIN = 16.0f;

    @Deprecated
    public static final float MENU_END_MARGIN = 15.0f;

    @Deprecated
    @NotNull
    public static final String STICKY_TAG = "sticky";

    @Deprecated
    @NotNull
    public static final String TAG = "TodoAdapter";

    @NotNull
    private static final a k = new a(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function1<T, Unit> onEdit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function2<T, Boolean, Unit> onDone;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Function1<T, Unit> onDelete;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isEditEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006HÆ\u0003J)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Group;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "", "component2", "title", "items", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Group<T extends Item> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<T> items;

        /* JADX WARN: Multi-variable type inference failed */
        public Group(@NotNull String str, @NotNull List<? extends T> list) {
            this.title = str;
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Group copy$default(Group group, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = group.title;
            }
            if ((i & 2) != 0) {
                list = group.items;
            }
            return group.copy(str, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<T> component2() {
            return this.items;
        }

        @NotNull
        public final Group<T> copy(@NotNull String title, @NotNull List<? extends T> items) {
            return new Group<>(title, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Group)) {
                return false;
            }
            Group group = (Group) other;
            return Intrinsics.areEqual(this.title, group.title) && Intrinsics.areEqual(this.items, group.items);
        }

        @NotNull
        public final List<T> getItems() {
            return this.items;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.items.hashCode();
        }

        @NotNull
        public String toString() {
            return "Group(title=" + this.title + ", items=" + this.items + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoAdapter$Item;", "", "", "getContent", "()Ljava/lang/String;", "content", "getTime", "time", "", "isDone", "()Z", Constants.IS_EXPIRED, "isEditable", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface Item {
        @NotNull
        String getContent();

        @NotNull
        String getTime();

        boolean isDone();

        boolean isEditable();

        boolean isExpired();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/TodoAdapter$a", "", "", "DELETE_START_MARGIN", "F", "MENU_END_MARGIN", "", "STICKY_TAG", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TodoAdapter(@NotNull Context context, @NotNull Function1<? super T, Unit> function1, @NotNull Function2<? super T, ? super Boolean, Unit> function2, @NotNull Function1<? super T, Unit> function3) {
        super(context);
        this.onEdit = function1;
        this.onDone = function2;
        this.onDelete = function3;
    }

    private final void m(HelperRecyclerViewHolder holder, final T item) {
        holder.setOnClickListener(R.id.iv_quick_delete, new View.OnClickListener() { // from class: kp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoAdapter.n(this.a, item, view);
            }
        });
        holder.setOnClickListener(R.id.iv_edit, new View.OnClickListener() { // from class: lp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoAdapter.o(this.a, item, view);
            }
        });
        holder.setOnClickListener(R.id.iv_delete, new View.OnClickListener() { // from class: mp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoAdapter.p(this.a, item, view);
            }
        });
        holder.setOnClickListener(R.id.smContentView, new View.OnClickListener() { // from class: jp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoAdapter.q(item, this, view);
            }
        });
        ((CheckBox) holder.getView(R.id.cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: np7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TodoAdapter.r(item, this, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(TodoAdapter todoAdapter, Item item, View view) {
        todoAdapter.onDelete.invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TodoAdapter todoAdapter, Item item, View view) {
        todoAdapter.onEdit.invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TodoAdapter todoAdapter, Item item, View view) {
        todoAdapter.onDelete.invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Item item, TodoAdapter todoAdapter, View view) {
        if (item.isDone()) {
            return;
        }
        todoAdapter.onEdit.invoke(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Item item, TodoAdapter todoAdapter, CompoundButton compoundButton, boolean z) {
        if (item.isDone() != z) {
            todoAdapter.onDone.invoke(item, Boolean.valueOf(z));
        }
    }

    private final void s(TextView textView, Item item) {
        if (item.isDone()) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.s2));
            textView.setPaintFlags(17);
        } else {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.s1));
            textView.setPaintFlags(1);
        }
        textView.setText(item.getContent());
    }

    private final void t(View editView, View deleteView, boolean isEditable) {
        ExtKt.setVisible$default(editView, isEditable, false, 2, null);
        ViewGroup.LayoutParams layoutParams = deleteView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(isEditable ? (int) ViewExKt.dp2px(deleteView, 16.0f) : 0);
            marginLayoutParams.setMarginEnd((int) ViewExKt.dp2px(deleteView, 15.0f));
            deleteView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public int getChildLayout(int viewType) {
        return R.layout.item_todo_with_menu;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public int getChildrenCount(int groupPosition) {
        return ((Group) getGroup(groupPosition)).getItems().size();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public int getFooterLayout(int viewType) {
        return 0;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public int getGroupCount() {
        return getGroups().size();
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public int getHeaderLayout(int viewType) {
        return R.layout.item_todo_header;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public boolean hasFooter(int groupPosition) {
        return false;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public boolean hasHeader(int groupPosition) {
        return true;
    }

    /* JADX INFO: renamed from: isEditEnable, reason: from getter */
    public final boolean getIsEditEnable() {
        return this.isEditEnable;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void onBindFooterViewHolder(@NotNull HelperRecyclerViewHolder holder, int groupPosition, @NotNull Group<T> item) {
    }

    public final void setEditEnable(boolean z) {
        if (z == this.isEditEnable) {
            return;
        }
        this.isEditEnable = z;
        notifyDataSetChanged();
    }

    @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.VisibilityProvider
    public boolean shouldHideDivider(int position, @Nullable RecyclerView parent) {
        return (judgeType(position) == 50002 && judgeType(position - 1) == 50002) ? false : true;
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void onBindChildViewHolder(@NotNull HelperRecyclerViewHolder holder, int groupPosition, int childPosition, @NotNull Group<T> item) {
        T t = item.getItems().get(childPosition);
        m(holder, t);
        s((TextView) holder.getView(R.id.tv_content), t);
        TextView textView = (TextView) holder.getView(R.id.tv_time);
        if (t.getTime().length() > 0) {
            textView.setVisibility(0);
            textView.setText(t.getTime());
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), t.isExpired() ? R.color.p2 : R.color.s2));
        } else {
            textView.setVisibility(8);
        }
        int i = R.id.cb;
        holder.setChecked(i, t.isDone());
        t(holder.getView(R.id.iv_edit), holder.getView(R.id.iv_delete), t.isEditable());
        if (this.isEditEnable) {
            holder.setVisible(i, false);
            holder.setVisible(R.id.iv_quick_delete, true);
        } else {
            holder.setVisible(i, true);
            holder.setVisible(R.id.iv_quick_delete, false);
        }
        View view = holder.itemView;
        if (view instanceof SwipeMenuLayout) {
            ((SwipeMenuLayout) view).setSwipeEnable(!getIsEditEnable());
        }
    }

    @Override // com.zhouyou.recyclerview.group.GroupedRecyclerViewAdapter
    public void onBindHeaderViewHolder(@NotNull HelperRecyclerViewHolder holder, int groupPosition, @NotNull Group<T> item) {
        holder.itemView.setTag("sticky");
        holder.setText(R.id.tv_header, item.getTitle());
    }
}
