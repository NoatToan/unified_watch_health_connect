package ha1;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\r\u000eB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lha1/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lha1/e$b;", "", "Lha1/g;", "menuOptions", "", "Lha1/f;", "imageList", "", "editMode", "<init>", "(Lha1/g;Ljava/util/List;Z)V", "b", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f82685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f> f82686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f82687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f82688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f82689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseBooleanArray f82690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f82692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<Integer> f82694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f82695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f82696l;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lha1/e$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "Lsq0/c;", "Landroid/view/View;", "view", "<init>", "(Lha1/e;Landroid/view/View;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 implements View.OnClickListener, View.OnLongClickListener, sq0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f82697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f82698b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, View view2) {
            super(view2);
            view2.getClass();
            this.f82698b = eVar;
            View viewFindViewById = view2.findViewById(R.id.iv_image);
            viewFindViewById.getClass();
            ImageView imageView = (ImageView) viewFindViewById;
            this.f82697a = imageView;
            imageView.setOnClickListener(this);
            if (eVar.f82687c) {
                imageView.setOnLongClickListener(this);
            }
        }

        @Override // sq0.c
        public final void a() {
            int i14 = this.f82698b.f82696l;
            ImageView imageView = this.f82697a;
            imageView.setPadding(i14, i14, i14, i14);
            imageView.setImageAlpha(102);
        }

        @Override // sq0.c
        public final void c() {
            ImageView imageView = this.f82697a;
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageAlpha(255);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (bindingAdapterPosition != -1) {
                e eVar = this.f82698b;
                boolean z14 = eVar.f82693i;
                g gVar = eVar.f82685a;
                if (z14) {
                    return;
                }
                if (!eVar.f82692h) {
                    gVar.T0(bindingAdapterPosition, eVar.f82686b);
                } else {
                    eVar.u(bindingAdapterPosition, !eVar.f82690f.get(bindingAdapterPosition), true);
                    gVar.I0(eVar.f82691g > 0);
                }
            }
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view2) {
            int bindingAdapterPosition;
            view2.getClass();
            e eVar = this.f82698b;
            if (eVar.f82692h || eVar.f82693i || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
                return false;
            }
            Object obj = eVar.f82688d;
            g gVar = obj instanceof g ? (g) obj : null;
            if (gVar != null) {
                gVar.W2(true);
                gVar.I0(true);
            }
            eVar.u(bindingAdapterPosition, !eVar.f82690f.get(bindingAdapterPosition), true);
            return true;
        }
    }

    static {
        new a(null);
    }

    public e(g gVar, List<f> list, boolean z14) {
        gVar.getClass();
        list.getClass();
        this.f82685a = gVar;
        this.f82686b = list;
        this.f82687c = z14;
        Context context = gVar.getContext();
        this.f82688d = context;
        Object systemService = gVar.getContext().getSystemService("layout_inflater");
        systemService.getClass();
        this.f82689e = (LayoutInflater) systemService;
        this.f82690f = new SparseBooleanArray(0);
        this.f82695k = (int) ((2 * context.getResources().getDisplayMetrics().density) + 0.5f);
        this.f82696l = (int) ((20 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void clear() {
        while (true) {
            List<f> list = this.f82686b;
            if (list.size() <= 0) {
                return;
            } else {
                list.remove(list.size() - 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f82686b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        e eVar = bVar.f82698b;
        ImageView imageView = bVar.f82697a;
        String str = this.f82686b.get(i14).f82699a;
        if (str != null) {
            cp.a.a(this.f82688d, str, imageView, null);
            boolean z14 = eVar.f82690f.get(i14);
            KeyEvent.Callback callback = bVar.itemView;
            if (callback instanceof Checkable) {
                callback.getClass();
                ((Checkable) callback).setChecked(z14);
            }
            if (!this.f82690f.get(i14)) {
                imageView.setPadding(0, 0, 0, 0);
                imageView.setBackgroundResource(0);
                imageView.setImageAlpha(255);
            } else {
                int i15 = eVar.f82695k;
                imageView.setPadding(i15, i15, i15, i15);
                imageView.setBackgroundResource(2131232816);
                imageView.setImageAlpha(102);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = this.f82689e.inflate(R.layout.image_cell_layout, viewGroup, false);
        viewInflate.getClass();
        return new b(this, viewInflate);
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        List<f> list = this.f82686b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            String str = list.get(i14).f82700b;
            if (str != null && this.f82690f.get(i14)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void t() {
        ArrayList<Integer> arrayList = this.f82694j;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int size = arrayList.size() - 1; size > 0; size -= 2) {
            Integer num = arrayList.get(size);
            num.getClass();
            int iIntValue = num.intValue();
            Integer num2 = arrayList.get(size - 1);
            num2.getClass();
            x(iIntValue, num2.intValue());
        }
    }

    public final void u(int i14, boolean z14, boolean z15) {
        String string;
        boolean z16 = this.f82690f.get(i14);
        this.f82690f.put(i14, z14);
        if (z16 != z14) {
            int i15 = this.f82691g;
            if (z14) {
                this.f82691g = i15 + 1;
            } else {
                this.f82691g = i15 - 1;
            }
            if (z15) {
                notifyItemChanged(i14);
            }
        }
        int i16 = this.f82691g;
        boolean z17 = this.f82692h;
        g gVar = this.f82685a;
        Context context = this.f82688d;
        if (!z17) {
            String string2 = context.getString(R.string.title_photos);
            string2.getClass();
            gVar.K4(2, string2);
            return;
        }
        if (i16 > 1) {
            x0 x0Var = x0.f105818a;
            String string3 = context.getString(R.string.lbl_photos_selected);
            string3.getClass();
            string = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf(i16)}, 1));
        } else if (i16 == 1) {
            string = context.getString(R.string.lbl_one_photo_selected);
            string.getClass();
        } else {
            string = context.getString(R.string.title_select_photos);
            string.getClass();
        }
        gVar.K4(3, string);
    }

    public final void x(int i14, int i15) {
        List<f> list = this.f82686b;
        if (i14 >= i15) {
            int i16 = i15 + 1;
            if (i16 <= i14) {
                int i17 = i14;
                while (true) {
                    Collections.swap(list, i17, i17 - 1);
                    if (i17 == i16) {
                        break;
                    } else {
                        i17--;
                    }
                }
            }
        } else {
            int i18 = i14;
            while (i18 < i15) {
                int i19 = i18 + 1;
                Collections.swap(list, i18, i19);
                i18 = i19;
            }
        }
        notifyItemMoved(i14, i15);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lha1/e$a;", "", "<init>", "()V", "", "ALPHA_40", "I", "ALPHA_255", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
