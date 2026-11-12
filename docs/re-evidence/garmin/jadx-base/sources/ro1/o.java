package ro1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.view.view_3_0.SquareImageView;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lro1/o;", "Landroid/widget/BaseAdapter;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.k f153994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<bq0.k> f153995c;

    static {
        new a(null);
    }

    public o(Context context) {
        context.getClass();
        this.f153993a = context;
        com.bumptech.glide.k kVarE = com.bumptech.glide.b.e(context);
        kVarE.getClass();
        this.f153994b = kVarE;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bq0.k getItem(int i14) {
        if (this.f153995c == null || getItemViewType(i14) == 0 || getItemViewType(i14) == 1) {
            return null;
        }
        List<bq0.k> list = this.f153995c;
        list.getClass();
        return list.get(i14 - 2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<bq0.k> list = this.f153995c;
        if (list == null) {
            return 2;
        }
        list.getClass();
        return list.size() + 2;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i14) {
        if (this.f153995c == null || getItemViewType(i14) == 0 || getItemViewType(i14) == 1) {
            return -1L;
        }
        List<bq0.k> list = this.f153995c;
        list.getClass();
        return list.get(i14 - 2).f19509a.hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i14) {
        if (i14 != 0) {
            return i14 != 1 ? 2 : 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        ImageView squareImageView;
        int itemViewType = getItemViewType(i14);
        Context context = this.f153993a;
        if (itemViewType != 2) {
            if (getItemViewType(i14) == 1) {
                return view2 == null ? new p(context, null, 0, false) : view2;
            }
            return view2 == null ? new p(this.f153993a, null, 0, false, 14, null) : view2;
        }
        if (view2 == null) {
            squareImageView = new SquareImageView(context);
            squareImageView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            squareImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            squareImageView = (ImageView) view2;
        }
        bq0.k item = getItem(i14);
        item.getClass();
        this.f153994b.d(Drawable.class).H(item.f19509a).M().E(squareImageView);
        return squareImageView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lro1/o$a;", "", "<init>", "()V", "", "VIEW_TYPE_CAMERA", "I", "VIEW_TYPE_IMAGE_PICKER", "VIEW_TYPE_IMAGE", "FIXED_VIEWS_COUNT", "", "THUMBNAIL_SIZE_PERCENT", "F", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
