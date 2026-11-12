package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter;
import com.xiaomi.hm.health.device.assistant.smart.SimpleItemTouchHelperCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0007*\u000259\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060)j\b\u0012\u0004\u0012\u00020\u0006`*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R#\u00101\u001a\b\u0012\u0004\u0012\u00020!0,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b&\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b#\u00107R\u001d\u0010<\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b-\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/device/assistant/smart/ItemTouchHelperAdapter;", "", "position", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/Contact;", "c", "", "editMode", "", "setEditMode", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "onBindViewHolder", "", "contacts", "update", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "fromPosition", "toPosition", "onItemMove", "onItemDismiss", "viewHolder", "canMove", "selected", "onSelectedChanged", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeEvent;", "getPositionChangeEvents", "a", "Z", "Landroid/view/LayoutInflater;", "b", "Landroid/view/LayoutInflater;", "layoutInflater", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "e", "()Ljava/util/List;", "positionChangeEvent", "Landroidx/recyclerview/widget/ItemTouchHelper;", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "dragHelper", "com/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter$dragEventListener$2$1", "f", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter$dragEventListener$2$1;", "dragEventListener", "com/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter$itemEventListener$2$1", "g", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter$itemEventListener$2$1;", "itemEventListener", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BtContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ItemTouchHelperAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean editMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutInflater layoutInflater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Contact> contacts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy positionChangeEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy dragHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy dragEventListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy itemEventListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/ItemTouchHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ItemTouchHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ItemTouchHelper invoke() {
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = new SimpleItemTouchHelperCallback(BtContactAdapter.this);
            simpleItemTouchHelperCallback.setLongPressEnable(false);
            return new ItemTouchHelper(simpleItemTouchHelperCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeEvent;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<PositionChangeEvent>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<PositionChangeEvent> invoke() {
            return new ArrayList();
        }
    }

    public BtContactAdapter() {
        this(false, 1, null);
    }

    public /* synthetic */ BtContactAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    private final BtContactAdapter$dragEventListener$2.AnonymousClass1 a() {
        return (BtContactAdapter$dragEventListener$2.AnonymousClass1) this.dragEventListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ItemTouchHelper b() {
        return (ItemTouchHelper) this.dragHelper.getValue();
    }

    private final Contact c(int position) {
        if (position < 0 || position >= this.contacts.size()) {
            return null;
        }
        return this.contacts.get(position);
    }

    private final BtContactAdapter$itemEventListener$2.AnonymousClass1 d() {
        return (BtContactAdapter$itemEventListener$2.AnonymousClass1) this.itemEventListener.getValue();
    }

    private final List<PositionChangeEvent> e() {
        return (List) this.positionChangeEvent.getValue();
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        return ItemTouchHelperAdapter.DefaultImpls.canDropOver(this, recyclerView, viewHolder, viewHolder2);
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public boolean canMove(@NotNull RecyclerView.ViewHolder viewHolder) {
        return this.editMode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.contacts.size();
    }

    @NotNull
    public final List<PositionChangeEvent> getPositionChangeEvents() {
        return e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        this.layoutInflater = LayoutInflater.from(recyclerView.getContext());
        b().attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Contact contactC;
        if (!(holder instanceof ViewHolder) || (contactC = c(position)) == null) {
            return;
        }
        ((ViewHolder) holder).bind(contactC, this.editMode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = this.layoutInflater;
        Objects.requireNonNull(layoutInflater);
        return new ViewHolder(layoutInflater.inflate(R.layout.item_bt_contact, parent, false), d(), a());
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        if (position >= getFragmentsCount()) {
            return;
        }
        e().add(new PositionChangeEvent(PositionChangeType.DELETE, position, 0, 4, null));
        this.contacts.remove(position);
        notifyItemRemoved(position);
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public void onItemMove(int fromPosition, int toPosition) {
        e().add(new PositionChangeEvent(PositionChangeType.MOVE, fromPosition, toPosition));
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    @RequiresApi(21)
    public void onSelectedChanged(@NotNull RecyclerView.ViewHolder viewHolder, boolean selected) {
        viewHolder.itemView.setElevation(selected ? 2.0f : 0.0f);
    }

    public final void setEditMode(boolean editMode) {
        this.editMode = editMode;
        if (editMode) {
            e().clear();
        }
    }

    public final void update(@NotNull List<Contact> contacts) {
        this.contacts.clear();
        this.contacts.addAll(contacts);
        notifyDataSetChanged();
    }

    public BtContactAdapter(boolean z) {
        this.editMode = z;
        this.contacts = new ArrayList<>();
        this.positionChangeEvent = LazyKt__LazyJVMKt.lazy(b.a);
        this.dragHelper = LazyKt__LazyJVMKt.lazy(new a());
        this.dragEventListener = LazyKt__LazyJVMKt.lazy(new Function0<BtContactAdapter$dragEventListener$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactAdapter$dragEventListener$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactAdapter$dragEventListener$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final BtContactAdapter btContactAdapter = this.a;
                return new IItemDragEventListener() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactAdapter$dragEventListener$2.1
                    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.contact.IItemDragEventListener
                    public void onStartDrag(@NotNull ViewHolder holder) {
                        btContactAdapter.b().startDrag(holder);
                    }
                };
            }
        });
        this.itemEventListener = LazyKt__LazyJVMKt.lazy(new Function0<BtContactAdapter$itemEventListener$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactAdapter$itemEventListener$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactAdapter$itemEventListener$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final BtContactAdapter btContactAdapter = this.a;
                return new IItemEventListener() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactAdapter$itemEventListener$2.1
                    @Override // com.xiaomi.hm.health.ui.smartplay.btphone.contact.IItemEventListener
                    public void onDelete(int position) {
                        btContactAdapter.onItemDismiss(position);
                    }
                };
            }
        });
    }
}
