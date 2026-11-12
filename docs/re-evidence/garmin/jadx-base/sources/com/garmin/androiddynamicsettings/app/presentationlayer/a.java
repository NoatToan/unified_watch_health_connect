package com.garmin.androiddynamicsettings.app.presentationlayer;

import a61.d0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\f\r\u000eB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/a;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/a$b;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/a$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", FirebaseAnalytics.Param.ITEMS, "", "selected", "<init>", "(Landroid/content/Context;Ljava/util/List;I)V", "a", "b", "c", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends x<b, c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f50680c;

    /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.presentationlayer.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/a$a;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/a$b;", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1018a extends o.f<b> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.equals(bVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.f50681a == bVar4.f50681a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/a$b;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "name", "<init>", "(ILjava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C1019a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50682b;

        /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.presentationlayer.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C1019a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(int i14, String str) {
            str.getClass();
            this.f50681a = i14;
            this.f50682b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f50681a == bVar.f50681a && this.f50682b.equals(bVar.f50682b);
        }

        public final int hashCode() {
            return this.f50682b.hashCode() + (Integer.hashCode(this.f50681a) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f50681a, "SelectableItem(id=", ", name=", this.f50682b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f50681a);
            parcel.writeString(this.f50682b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "containerView", "<init>", "(Lcom/garmin/androiddynamicsettings/app/presentationlayer/a;Landroid/view/View;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f50683d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f50684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f50685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f50686c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f50686c = aVar;
            View viewFindViewById = view2.findViewById(R.id.selected_title_text_view);
            viewFindViewById.getClass();
            this.f50684a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.selected_option_image_view);
            viewFindViewById2.getClass();
            this.f50685b = (ImageView) viewFindViewById2;
            view2.setOnClickListener(new d0(22, aVar, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, List<b> list, int i14) {
        super(new C1018a());
        context.getClass();
        list.getClass();
        this.f50679b = i14;
        this.f50680c = LayoutInflater.from(context);
        t(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        c cVar = (c) f0Var;
        cVar.getClass();
        TextView textView = cVar.f50684a;
        a aVar = cVar.f50686c;
        textView.setText(aVar.r(i14).f50682b);
        cVar.f50685b.setVisibility(i14 == aVar.f50679b ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = this.f50680c.inflate(R.layout.dsl_selection_view, viewGroup, false);
        viewInflate.getClass();
        return new c(this, viewInflate);
    }

    public /* synthetic */ a(Context context, List list, int i14, int i15, j jVar) {
        this(context, list, (i15 & 4) != 0 ? 0 : i14);
    }
}
