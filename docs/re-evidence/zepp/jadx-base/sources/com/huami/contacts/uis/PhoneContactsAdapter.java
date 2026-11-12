package com.huami.contacts.uis;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.contacts.R;
import com.huami.contacts.bean.ContactDecorator;
import com.huami.contacts.bean.PhoneContact;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 ,2\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0003,-.B\u0011\u0012\b\b\u0002\u0010)\u001a\u00020&¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0014R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006/"}, d2 = {"Lcom/huami/contacts/uis/PhoneContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/contacts/uis/BaseHolder;", "", "position", "Lcom/huami/contacts/uis/ItemBean;", "", "a", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "", "onBindViewHolder", "getItemViewType", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "", "updates", "updateItems", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "layoutInflater", "", "b", "Ljava/util/List;", "items", "Lcom/huami/contacts/uis/ItemEventListener;", "c", "Lcom/huami/contacts/uis/ItemEventListener;", "getItemSelectListener", "()Lcom/huami/contacts/uis/ItemEventListener;", "setItemSelectListener", "(Lcom/huami/contacts/uis/ItemEventListener;)V", "itemSelectListener", "", GoogleApiAvailabilityLight.a, "Z", "showRightSpace", "<init>", "(Z)V", "Companion", "PhoneContactHolder", "SectionHolder", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class PhoneContactsAdapter extends RecyclerView.Adapter<BaseHolder<?>> {
    public static final int TYPE_ITEM = 2;
    public static final int TYPE_SECTION = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LayoutInflater layoutInflater;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<ItemBean<Object>> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ItemEventListener itemSelectListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showRightSpace;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u001e\u0010\f\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u001e\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001e\u0010\u0012\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\n \n*\u0004\u0018\u00010\u00130\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/contacts/uis/PhoneContactsAdapter$PhoneContactHolder;", "Lcom/huami/contacts/uis/BaseHolder;", "Lcom/huami/contacts/bean/ContactDecorator;", "", "select", "", "a", "item", "onBind", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "Landroidx/appcompat/widget/AppCompatTextView;", "userNameTv", "b", "phoneNumTv", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "selectIv", "Landroid/view/View;", GoogleApiAvailabilityLight.a, "Landroid/view/View;", "rightSpace", "e", "Lcom/huami/contacts/bean/ContactDecorator;", "itemView", "<init>", "(Lcom/huami/contacts/uis/PhoneContactsAdapter;Landroid/view/View;)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public final class PhoneContactHolder extends BaseHolder<ContactDecorator> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AppCompatTextView userNameTv;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AppCompatTextView phoneNumTv;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ImageView selectIv;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final View rightSpace;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private ContactDecorator item;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactDecorator contactDecorator = PhoneContactHolder.this.item;
                boolean zIsSelect = contactDecorator != null ? contactDecorator.isSelect() : false;
                ItemEventListener itemSelectListener = PhoneContactsAdapter.this.getItemSelectListener();
                if (itemSelectListener != null ? itemSelectListener.allowAction(!zIsSelect) : true) {
                    ContactDecorator contactDecorator2 = PhoneContactHolder.this.item;
                    if (contactDecorator2 != null) {
                        contactDecorator2.setSelect(!zIsSelect);
                    }
                    PhoneContactHolder.this.a(!zIsSelect);
                }
            }
        }

        public PhoneContactHolder(View view) {
            super(view);
            this.userNameTv = (AppCompatTextView) view.findViewById(R.id.user_name_tv);
            this.phoneNumTv = (AppCompatTextView) view.findViewById(R.id.phone_tv);
            this.selectIv = (ImageView) view.findViewById(R.id.iv_select);
            View viewFindViewById = view.findViewById(R.id.slide_bar_space);
            this.rightSpace = viewFindViewById;
            if (PhoneContactsAdapter.this.showRightSpace) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
            view.setOnClickListener(new a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(boolean select) {
            Drawable drawable;
            Context context = this.selectIv.getContext();
            Drawable drawable2 = null;
            if (select) {
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_checked_20_p3_2x);
                if (drawable != null) {
                    drawable.setTint(ContextCompat.getColor(context, R.color.p3));
                    drawable2 = drawable;
                }
            } else {
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_check_20_s3_2x);
                if (drawable != null) {
                    drawable.setTint(ContextCompat.getColor(context, R.color.s2));
                    drawable2 = drawable;
                }
            }
            this.selectIv.setImageDrawable(drawable2);
        }

        @Override // com.huami.contacts.uis.BaseHolder
        public void onBind(@NotNull ContactDecorator item) {
            this.item = item;
            PhoneContact phoneContact = item.getPhoneContact();
            this.userNameTv.setText(phoneContact.getDisPlayName());
            this.phoneNumTv.setText(phoneContact.getPhoneNum());
            a(item.isSelect());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/huami/contacts/uis/PhoneContactsAdapter$SectionHolder;", "Lcom/huami/contacts/uis/BaseHolder;", "", "item", "", "onBind", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "a", "Landroidx/appcompat/widget/AppCompatTextView;", "sectionTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/contacts/uis/PhoneContactsAdapter;Landroid/view/View;)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public final class SectionHolder extends BaseHolder<String> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AppCompatTextView sectionTv;

        public SectionHolder(View view) {
            super(view);
            this.sectionTv = (AppCompatTextView) view.findViewById(R.id.section_tv);
        }

        @Override // com.huami.contacts.uis.BaseHolder
        public void onBind(@NotNull String item) {
            this.sectionTv.setText(item);
        }
    }

    public PhoneContactsAdapter() {
        this(false, 1, null);
    }

    public /* synthetic */ PhoneContactsAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    private final ItemBean<Object> a(int position) {
        if (position >= this.items.size() || position < 0) {
            return null;
        }
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.items.size();
    }

    @Nullable
    public final ItemEventListener getItemSelectListener() {
        return this.itemSelectListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ItemBean<Object> itemBeanA = a(position);
        if (itemBeanA != null) {
            return itemBeanA.getType();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        this.layoutInflater = LayoutInflater.from(recyclerView.getContext());
    }

    public final void setItemSelectListener(@Nullable ItemEventListener itemEventListener) {
        this.itemSelectListener = itemEventListener;
    }

    public final void updateItems(@NotNull List<ItemBean<Object>> updates) {
        this.items.clear();
        this.items.addAll(updates);
    }

    public PhoneContactsAdapter(boolean z) {
        this.showRightSpace = z;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BaseHolder<?> holder, int position) {
        ItemBean<Object> itemBeanA = a(position);
        if (itemBeanA != null) {
            if (holder instanceof PhoneContactHolder) {
                Object t = itemBeanA.getT();
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.huami.contacts.bean.ContactDecorator");
                ((PhoneContactHolder) holder).onBind((ContactDecorator) t);
            } else if (holder instanceof SectionHolder) {
                ((SectionHolder) holder).onBind(itemBeanA.getT().toString());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BaseHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return viewType == 1 ? new SectionHolder(this.layoutInflater.inflate(R.layout.item_char_header, parent, false)) : new PhoneContactHolder(this.layoutInflater.inflate(R.layout.item_phone_contact, parent, false));
    }
}
