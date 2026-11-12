package qh2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import aq.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqh2/c;", "Lqh2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "getRequiredControlStartPosition", "()I", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends qh2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<Integer> f144804d;

    static {
        new a(null);
        f144804d = x.k(Integer.valueOf(R.id.control_item_1), Integer.valueOf(R.id.control_item_2), Integer.valueOf(R.id.control_item_3), Integer.valueOf(R.id.control_item_4), Integer.valueOf(R.id.control_item_5), Integer.valueOf(R.id.control_item_6), Integer.valueOf(R.id.control_item_7), Integer.valueOf(R.id.control_item_8), Integer.valueOf(R.id.control_item_9));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, null, 0, 6, null);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.dsl_bounded_controls_menu_square_preview, (ViewGroup) this, true);
    }

    @Override // qh2.a
    public int getRequiredControlStartPosition() {
        return 4;
    }

    @Override // qh2.a
    public final void i(int i14) {
        List<Integer> list = f144804d;
        setNoOfOptions(list.size());
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            ImageView imageView = (ImageView) findViewById(((Number) obj).intValue());
            imageView.setOnClickListener(new b0(this, i15, 17));
            arrayList.add(imageView);
            i15 = i16;
        }
        setWatchFaceIconImageViews((ImageView[]) arrayList.toArray(new ImageView[0]));
    }

    @Override // qh2.a
    public final void j(int i14, boolean z14) {
        ImageView[] watchFaceIconImageViews = getWatchFaceIconImageViews();
        int length = watchFaceIconImageViews.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            ImageView imageView = watchFaceIconImageViews[i15];
            int i17 = i16 + 1;
            if (imageView != null) {
                imageView.setSelected(i16 == i14 && z14);
            }
            if (imageView != null) {
                imageView.setAlpha((i16 == i14 || !z14) ? 1.0f : 0.5f);
            }
            i15++;
            i16 = i17;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqh2/c$a;", "", "<init>", "()V", "", "MIDDLE_INDEX", "I", "", "imageViewIds", "Ljava/util/List;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
