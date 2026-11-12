package hz1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import com.mapbox.maps.MapboxMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import ro1.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\n\u000b\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lhz1/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lhz1/c$c;", "Li/c;", "activity", "", MapboxMap.QFE_LIMIT, "mSelectedPosition", "<init>", "(Li/c;II)V", "c", "b", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<ViewOnClickListenerC1715c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f86520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.c f86521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f86522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f86523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f86525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<e> f86526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SparseBooleanArray f86527i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhz1/c$b;", "Landroidx/recyclerview/widget/o$b;", "", "Lhz1/e;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<e> f86528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<e> f86529b;

        public b(List<e> list, List<e> list2) {
            this.f86528a = list;
            this.f86529b = list2;
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean a(int i14, int i15) {
            return f(i14, i15);
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean b(int i14, int i15) {
            return f(i14, i15);
        }

        @Override // androidx.recyclerview.widget.o.b
        public final int d() {
            List<e> list = this.f86529b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.o.b
        public final int e() {
            List<e> list = this.f86528a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final boolean f(int i14, int i15) {
            List<e> list;
            List<e> list2 = this.f86528a;
            if (list2 == null || list2.isEmpty() || (list = this.f86529b) == null || list.isEmpty() || i14 >= e() || i15 >= d()) {
                return false;
            }
            e eVar = list2.get(i14);
            e eVar2 = list.get(i15);
            return eVar.f86534a.equals(eVar2.f86534a) && eVar.f86535b.equals(eVar2.f86535b) && eVar.f86536c.equals(eVar2.f86536c);
        }
    }

    /* JADX INFO: renamed from: hz1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhz1/c$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "<init>", "(Lhz1/c;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class ViewOnClickListenerC1715c extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f86530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f86531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOnClickListenerC1715c(c cVar, View view2) {
            super(view2);
            view2.getClass();
            this.f86531b = cVar;
            ImageView imageView = (ImageView) view2.findViewById(R.id.iv_image);
            this.f86530a = imageView;
            if (imageView != null) {
                view2.setOnClickListener(this);
            }
        }

        public final void d(int i14) {
            int itemViewType = getItemViewType();
            c cVar = this.f86531b;
            if (itemViewType != 2) {
                boolean z14 = cVar.f86524f;
                View view2 = this.itemView;
                if (z14) {
                    view2.setBackgroundResource(R.color.palette_interface_100);
                    return;
                } else {
                    view2.setBackgroundResource(R.color.palette_interface_54);
                    return;
                }
            }
            boolean z15 = cVar.f86524f;
            ImageView imageView = this.f86530a;
            if (!z15 || cVar.f86527i.get(i14)) {
                if (imageView != null) {
                    imageView.clearColorFilter();
                }
            } else if (imageView != null) {
                imageView.setColorFilter(Color.argb(102, 255, 255, 255), PorterDuff.Mode.SRC_ATOP);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (getItemViewType() != 2 || bindingAdapterPosition == -1) {
                return;
            }
            c cVar = this.f86531b;
            boolean z14 = cVar.f86527i.get(bindingAdapterPosition);
            cVar.z(bindingAdapterPosition);
            if (z14) {
                cVar.f86519a = -1;
                TrainingInitiativeEventActivity.f45718o.getClass();
                TrainingInitiativeEventActivity.a.b();
                TrainingInitiativeEventActivity.f45720q = -1;
                cVar.A(bindingAdapterPosition, !cVar.f86527i.get(bindingAdapterPosition));
            } else {
                int i14 = cVar.f86519a;
                if (i14 > -1) {
                    cVar.A(i14, false);
                }
                TrainingInitiativeEventActivity.f45718o.getClass();
                TrainingInitiativeEventActivity.a.b();
                TrainingInitiativeEventActivity.f45720q = bindingAdapterPosition;
                cVar.A(bindingAdapterPosition, !cVar.f86527i.get(bindingAdapterPosition));
                cVar.f86519a = bindingAdapterPosition;
            }
            c.r(cVar);
        }
    }

    static {
        new a(null);
    }

    public c(i.c cVar, int i14, int i15) {
        cVar.getClass();
        this.f86519a = -1;
        this.f86521c = cVar;
        this.f86523e = i14 >= 1 ? 10 : i14;
        k kVarE = com.bumptech.glide.b.c(cVar).e(cVar);
        kVarE.getClass();
        this.f86520b = kVarE;
        this.f86527i = new SparseBooleanArray(0);
        this.f86525g = (int) ((2 * cVar.getResources().getDisplayMetrics().density) + 0.5f);
        Object systemService = cVar.getSystemService("layout_inflater");
        systemService.getClass();
        this.f86522d = (LayoutInflater) systemService;
        this.f86519a = i15;
    }

    public static final void r(c cVar) {
        int iX = cVar.x();
        i.c cVar2 = cVar.f86521c;
        if (cVar2 instanceof ImageMultiPickerActivity) {
            if (iX < 1) {
                MenuItem menuItem = ((ImageMultiPickerActivity) cVar2).f46084e;
                if (menuItem != null) {
                    menuItem.setEnabled(false);
                    return;
                }
                return;
            }
            ImageMultiPickerActivity imageMultiPickerActivity = (ImageMultiPickerActivity) cVar2;
            MenuItem menuItem2 = imageMultiPickerActivity.f46084e;
            if (menuItem2 != null) {
                menuItem2.setEnabled(true);
            }
            if (iX == 1) {
                imageMultiPickerActivity.updateActionBarTitle(cVar2.getString(R.string.lbl_one_photo_selected));
                return;
            }
            x0 x0Var = x0.f105818a;
            String string = cVar2.getString(R.string.lbl_photos_selected);
            string.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(iX);
            imageMultiPickerActivity.updateActionBarTitle(String.format(string, Arrays.copyOf(new Object[]{sb3.toString()}, 1)));
        }
    }

    public final void A(int i14, boolean z14) {
        boolean z15 = this.f86527i.get(i14);
        this.f86527i.put(i14, z14);
        if (z15 != z14) {
            notifyItemChanged(i14);
        }
        u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<e> list = this.f86526h;
        if (list != null) {
            return (list != null ? list.size() : 0) + 2;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (i14 != 0) {
            return i14 != 1 ? 2 : 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        List<e> list;
        ViewOnClickListenerC1715c viewOnClickListenerC1715c = (ViewOnClickListenerC1715c) f0Var;
        viewOnClickListenerC1715c.getClass();
        c cVar = viewOnClickListenerC1715c.f86531b;
        ImageView imageView = viewOnClickListenerC1715c.f86530a;
        int itemViewType = getItemViewType(i14);
        if (itemViewType == 0) {
            final int i15 = 0;
            viewOnClickListenerC1715c.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: hz1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f86518b;

                {
                    this.f86518b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            c cVar2 = this.f86518b;
                            int i16 = cVar2.f86523e;
                            i.c cVar3 = cVar2.f86521c;
                            if (i16 != cVar2.x() && (cVar3 instanceof ImageMultiPickerActivity)) {
                                ImageMultiPickerActivity imageMultiPickerActivity = (ImageMultiPickerActivity) cVar3;
                                j22.b bVar = j22.b.f96736a;
                                j22.a[] aVarArr = imageMultiPickerActivity.f46087h;
                                j22.a[] aVarArr2 = (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
                                bVar.getClass();
                                if (!j22.b.k(aVarArr2)) {
                                    j22.b.x(imageMultiPickerActivity, 2, (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
                                } else {
                                    imageMultiPickerActivity.f46085f = yy.a.c(imageMultiPickerActivity, new File(pi1.b.a(imageMultiPickerActivity, null), "captured_image.jpg"));
                                }
                            } else {
                                Toast.makeText(cVar3, R.string.activities_photo_limit_message, 0).show();
                            }
                            break;
                        default:
                            c cVar4 = this.f86518b;
                            int i17 = cVar4.f86523e;
                            i.c cVar5 = cVar4.f86521c;
                            if (i17 != cVar4.x() && (cVar5 instanceof ImageMultiPickerActivity)) {
                                ((ImageMultiPickerActivity) cVar5).ca();
                            } else {
                                Toast.makeText(cVar5, R.string.activities_photo_limit_message, 0).show();
                            }
                            break;
                    }
                }
            });
            viewOnClickListenerC1715c.d(i14);
            return;
        }
        if (itemViewType == 1) {
            final int i16 = 1;
            viewOnClickListenerC1715c.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: hz1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f86518b;

                {
                    this.f86518b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            c cVar2 = this.f86518b;
                            int i17 = cVar2.f86523e;
                            i.c cVar3 = cVar2.f86521c;
                            if (i17 != cVar2.x() && (cVar3 instanceof ImageMultiPickerActivity)) {
                                ImageMultiPickerActivity imageMultiPickerActivity = (ImageMultiPickerActivity) cVar3;
                                j22.b bVar = j22.b.f96736a;
                                j22.a[] aVarArr = imageMultiPickerActivity.f46087h;
                                j22.a[] aVarArr2 = (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
                                bVar.getClass();
                                if (!j22.b.k(aVarArr2)) {
                                    j22.b.x(imageMultiPickerActivity, 2, (j22.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
                                } else {
                                    imageMultiPickerActivity.f46085f = yy.a.c(imageMultiPickerActivity, new File(pi1.b.a(imageMultiPickerActivity, null), "captured_image.jpg"));
                                }
                            } else {
                                Toast.makeText(cVar3, R.string.activities_photo_limit_message, 0).show();
                            }
                            break;
                        default:
                            c cVar4 = this.f86518b;
                            int i18 = cVar4.f86523e;
                            i.c cVar5 = cVar4.f86521c;
                            if (i18 != cVar4.x() && (cVar5 instanceof ImageMultiPickerActivity)) {
                                ((ImageMultiPickerActivity) cVar5).ca();
                            } else {
                                Toast.makeText(cVar5, R.string.activities_photo_limit_message, 0).show();
                            }
                            break;
                    }
                }
            });
            viewOnClickListenerC1715c.d(i14);
            return;
        }
        if (itemViewType != 2 || (list = this.f86526h) == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) z(i14);
        j jVarM = this.f86520b.d(Drawable.class).H(eVar != null ? eVar.f86534a : null).M();
        imageView.getClass();
        jVarM.E(imageView);
        boolean z14 = cVar.f86527i.get(i14);
        KeyEvent.Callback callback = viewOnClickListenerC1715c.itemView;
        if (callback instanceof Checkable) {
            callback.getClass();
            ((Checkable) callback).setChecked(z14);
        }
        if (this.f86527i.get(i14)) {
            int i17 = cVar.f86525g;
            imageView.setPadding(i17, i17, i17, i17);
            imageView.setBackgroundResource(2131232816);
            imageView.setImageAlpha(102);
        } else {
            imageView.setPadding(0, 0, 0, 0);
            imageView.setBackgroundResource(0);
            imageView.setImageAlpha(255);
        }
        viewOnClickListenerC1715c.d(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        i.c cVar = this.f86521c;
        if (i14 == 1) {
            return new ViewOnClickListenerC1715c(this, new p(cVar, null, 0, false, 6, null));
        }
        if (i14 != 2) {
            return new ViewOnClickListenerC1715c(this, new p(cVar, null, 0, false, 14, null));
        }
        View viewInflate = this.f86522d.inflate(R.layout.image_cell_layout, viewGroup, false);
        viewInflate.getClass();
        return new ViewOnClickListenerC1715c(this, viewInflate);
    }

    public final void t(e eVar) {
        List<e> list = this.f86526h;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f86526h = arrayList;
            arrayList.add(eVar);
        } else if (!h0.R(list, eVar)) {
            List<e> list2 = this.f86526h;
            list2.getClass();
            ((ArrayList) list2).add(0, eVar);
        }
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void u() {
        if (this.f86524f) {
            this.f86524f = false;
            notifyDataSetChanged();
            return;
        }
        boolean z14 = x() == this.f86523e;
        this.f86524f = z14;
        if (z14) {
            notifyDataSetChanged();
        }
    }

    public final int x() {
        int size = this.f86527i.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            SparseBooleanArray sparseBooleanArray = this.f86527i;
            i14 += sparseBooleanArray.get(sparseBooleanArray.keyAt(i15)) ? 1 : 0;
        }
        return i14;
    }

    public final Object z(int i14) {
        if (this.f86526h == null || getItemViewType(i14) == 0 || getItemViewType(i14) == 1) {
            return null;
        }
        List<e> list = this.f86526h;
        list.getClass();
        return list.get(i14 - 2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhz1/c$a;", "", "<init>", "()V", "", "VIEW_TYPE_CAMERA", "I", "VIEW_TYPE_IMAGE_PICKER", "VIEW_TYPE_IMAGE", "FIXED_VIEWS_COUNT", "ALPHA_40", "", "THUMBNAIL_SIZE_PERCENT", "F", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
