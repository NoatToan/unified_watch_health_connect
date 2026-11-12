package zy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\fB\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lzy/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "Lzy/l;", "mTextReplyItems", "Lzy/g;", "mActionListener", "<init>", "(Ljava/util/List;Lzy/g;)V", "a", "c", "b", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<l> f207389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f207390b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzy/i$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lsq0/c;", "Landroid/view/View;", "itemView", "<init>", "(Lzy/i;Landroid/view/View;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 implements sq0.c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f207391h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f207392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f207393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f207394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f207395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f207396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f207397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i f207398g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final i iVar, View view2) {
            super(view2);
            view2.getClass();
            this.f207398g = iVar;
            View viewFindViewById = view2.findViewById(R.id.reply_main_action_imageview);
            viewFindViewById.getClass();
            ImageView imageView = (ImageView) viewFindViewById;
            this.f207392a = imageView;
            View viewFindViewById2 = view2.findViewById(R.id.reply_drag_action_imageview);
            viewFindViewById2.getClass();
            ImageView imageView2 = (ImageView) viewFindViewById2;
            this.f207393b = imageView2;
            View viewFindViewById3 = view2.findViewById(R.id.reply_textview);
            viewFindViewById3.getClass();
            TextView textView = (TextView) viewFindViewById3;
            this.f207394c = textView;
            this.f207395d = -1;
            this.f207396e = 0.4f;
            this.f207397f = 1.0f;
            imageView2.setOnTouchListener(new b00.d(4, iVar, this));
            final int i14 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zy.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i.a f207387b;

                {
                    this.f207387b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    g gVar;
                    int i15 = i14;
                    i iVar2 = iVar;
                    i.a aVar = this.f207387b;
                    switch (i15) {
                        case 0:
                            int i16 = i.a.f207391h;
                            int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                            if (bindingAdapterPosition != -1 && (gVar = iVar2.f207390b) != null) {
                                gVar.Y2(bindingAdapterPosition);
                                break;
                            }
                            break;
                        default:
                            int i17 = i.a.f207391h;
                            int bindingAdapterPosition2 = aVar.getBindingAdapterPosition();
                            g gVar2 = iVar2.f207390b;
                            if (gVar2 != null && bindingAdapterPosition2 != -1) {
                                gVar2.s8(bindingAdapterPosition2);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i15 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: zy.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i.a f207387b;

                {
                    this.f207387b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    g gVar;
                    int i16 = i15;
                    i iVar2 = iVar;
                    i.a aVar = this.f207387b;
                    switch (i16) {
                        case 0:
                            int i17 = i.a.f207391h;
                            int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                            if (bindingAdapterPosition != -1 && (gVar = iVar2.f207390b) != null) {
                                gVar.Y2(bindingAdapterPosition);
                                break;
                            }
                            break;
                        default:
                            int i18 = i.a.f207391h;
                            int bindingAdapterPosition2 = aVar.getBindingAdapterPosition();
                            g gVar2 = iVar2.f207390b;
                            if (gVar2 != null && bindingAdapterPosition2 != -1) {
                                gVar2.s8(bindingAdapterPosition2);
                                break;
                            }
                            break;
                    }
                }
            });
        }

        @Override // sq0.c
        public final void a() {
            this.itemView.setAlpha(this.f207396e);
        }

        @Override // sq0.c
        public final void c() {
            this.itemView.setAlpha(this.f207397f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzy/i$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lzy/i;Landroid/view/View;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f207399e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f207400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f207401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f207402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f207403d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, View view2) {
            super(view2);
            view2.getClass();
            this.f207403d = iVar;
            this.f207400a = (TextView) view2.findViewById(R.id.reply_item_title_textview);
            this.f207401b = (TextView) view2.findViewById(R.id.reply_item_info_textview);
            View viewFindViewById = view2.findViewById(R.id.reply_item_add_message_button);
            this.f207402c = viewFindViewById;
            if (viewFindViewById == null || iVar.f207390b == null) {
                return;
            }
            viewFindViewById.setOnClickListener(new j(iVar, 0));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzy/i$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lzy/i;Landroid/view/View;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f207404e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f207405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f207406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f207407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f207408d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(final i iVar, View view2) {
            super(view2);
            view2.getClass();
            this.f207408d = iVar;
            View viewFindViewById = view2.findViewById(R.id.reply_main_action_imageview);
            viewFindViewById.getClass();
            ImageView imageView = (ImageView) viewFindViewById;
            this.f207405a = imageView;
            View viewFindViewById2 = view2.findViewById(R.id.reply_textview);
            viewFindViewById2.getClass();
            TextView textView = (TextView) viewFindViewById2;
            this.f207406b = textView;
            this.f207407c = -1;
            final int i14 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zy.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i.c f207412b;

                {
                    this.f207412b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    g gVar;
                    int i15 = i14;
                    i iVar2 = iVar;
                    i.c cVar = this.f207412b;
                    switch (i15) {
                        case 0:
                            int i16 = i.c.f207404e;
                            int bindingAdapterPosition = cVar.getBindingAdapterPosition();
                            if (bindingAdapterPosition != -1 && (gVar = iVar2.f207390b) != null) {
                                gVar.Y2(bindingAdapterPosition);
                                break;
                            }
                            break;
                        default:
                            int i17 = i.c.f207404e;
                            int bindingAdapterPosition2 = cVar.getBindingAdapterPosition();
                            if (iVar2.f207390b != null && bindingAdapterPosition2 != -1 && iVar2.f207389a.get(bindingAdapterPosition2).f207420g) {
                                iVar2.f207390b.s8(bindingAdapterPosition2);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i15 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: zy.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i.c f207412b;

                {
                    this.f207412b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    g gVar;
                    int i16 = i15;
                    i iVar2 = iVar;
                    i.c cVar = this.f207412b;
                    switch (i16) {
                        case 0:
                            int i17 = i.c.f207404e;
                            int bindingAdapterPosition = cVar.getBindingAdapterPosition();
                            if (bindingAdapterPosition != -1 && (gVar = iVar2.f207390b) != null) {
                                gVar.Y2(bindingAdapterPosition);
                                break;
                            }
                            break;
                        default:
                            int i18 = i.c.f207404e;
                            int bindingAdapterPosition2 = cVar.getBindingAdapterPosition();
                            if (iVar2.f207390b != null && bindingAdapterPosition2 != -1 && iVar2.f207389a.get(bindingAdapterPosition2).f207420g) {
                                iVar2.f207390b.s8(bindingAdapterPosition2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zy/i$d", "Landroidx/recyclerview/widget/RecyclerView$f0;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {
        public d(View view2) {
            super(view2);
        }
    }

    public i(List<l> list, g gVar) {
        list.getClass();
        this.f207389a = list;
        this.f207390b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f207389a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return this.f207389a.get(i14).f207419f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        int itemViewType = getItemViewType(i14);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                a aVar = (a) f0Var;
                i iVar = aVar.f207398g;
                l lVar = iVar.f207389a.get(i14);
                TextView textView = aVar.f207394c;
                textView.setText(lVar.f207414a);
                Context context = textView.getContext();
                int i15 = aVar.f207395d;
                if (i15 != -1) {
                    s0.o(i15, textView);
                    s0.j(0, textView);
                }
                String str = lVar.f207414a;
                String string = context.getString(R.string.edit_canned_message_action);
                string.getClass();
                v22.e.e(textView, str, string);
                if (lVar.f207420g) {
                    aVar.f207395d = s0.a(textView, context.getString(R.string.lbl_delete), new xj1.b(12, aVar, iVar));
                }
                int i16 = lVar.f207420g ? 0 : 8;
                aVar.f207392a.setVisibility(i16);
                aVar.f207393b.setVisibility(i16);
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType == 3) {
                    c cVar = (c) f0Var;
                    i iVar2 = cVar.f207408d;
                    l lVar2 = iVar2.f207389a.get(i14);
                    TextView textView2 = cVar.f207406b;
                    textView2.setText(lVar2.f207414a);
                    Context context2 = textView2.getContext();
                    int i17 = cVar.f207407c;
                    if (i17 != -1) {
                        s0.o(i17, textView2);
                        s0.j(0, textView2);
                    }
                    String str2 = lVar2.f207414a;
                    String string2 = context2.getString(R.string.edit_canned_message_action);
                    string2.getClass();
                    v22.e.e(textView2, str2, string2);
                    if (lVar2.f207420g) {
                        cVar.f207407c = s0.a(textView2, context2.getString(R.string.lbl_delete), new xj1.b(13, cVar, iVar2));
                    }
                    cVar.f207405a.setVisibility(lVar2.f207420g ? 0 : 8);
                    return;
                }
                if (itemViewType != 4) {
                    return;
                }
            }
        }
        b bVar = (b) f0Var;
        i iVar3 = bVar.f207403d;
        TextView textView3 = bVar.f207400a;
        if (textView3 != null) {
            textView3.setText(iVar3.f207389a.get(i14).f207417d);
        }
        TextView textView4 = bVar.f207401b;
        if (textView4 != null) {
            textView4.setText(iVar3.f207389a.get(i14).f207418e);
        }
        View view2 = bVar.f207402c;
        if (view2 != null) {
            v22.e.v(view2, iVar3.f207389a.get(i14).f207420g);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            return new b(this, n23.j.b(viewGroup, R.layout.gcm3_text_reply_header_list_item, viewGroup, false));
        }
        if (i14 == 1) {
            return new a(this, n23.j.b(viewGroup, R.layout.gcm3_text_reply_draggable_list_item, viewGroup, false));
        }
        if (i14 == 2) {
            return new b(this, n23.j.b(viewGroup, R.layout.gcm3_text_reply_section_divider_list_item, viewGroup, false));
        }
        if (i14 != 3) {
            return i14 != 4 ? new d(new View(viewGroup.getContext())) : new b(this, n23.j.b(viewGroup, R.layout.gcm3_text_reply_info_message_list_item, viewGroup, false));
        }
        return new c(this, n23.j.b(viewGroup, R.layout.gcm3_text_reply_non_draggable_list_item, viewGroup, false));
    }
}
