package com.garmin.android.apps.connectmobile.segments.presentation;

import am.z0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import do1.p;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalInstantException;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/f;", "", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41440a = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/f$a;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f41441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f41442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f41443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f41444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f41445e;

        public a(View view2) {
            view2.getClass();
            this.f41441a = new p(view2);
            View viewFindViewById = view2.findViewById(R.id.segment_header_name);
            viewFindViewById.getClass();
            this.f41442b = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.segment_header_creation_date);
            viewFindViewById2.getClass();
            this.f41443c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.header_like_unlike_btn);
            viewFindViewById3.getClass();
            this.f41444d = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.segment_watermark_activity_type);
            viewFindViewById4.getClass();
            this.f41445e = (ImageView) viewFindViewById4;
        }

        public final void a() {
            this.f41444d.setVisibility(8);
            this.f41441a.a(0, false);
        }
    }

    static {
        new f();
    }

    private f() {
    }

    public static final void a(Context context, a aVar, SegmentDetailsDTO segmentDetailsDTO) {
        DateTime dateTime;
        String strI;
        String strI2;
        aVar.getClass();
        ImageView imageView = aVar.f41445e;
        TextView textView = aVar.f41443c;
        if (segmentDetailsDTO != null) {
            aVar.f41442b.setText(segmentDetailsDTO.f17838c);
            try {
                dateTime = DateTime.parse(segmentDetailsDTO.f41282w, DateTimeFormat.forPattern("MMM d, yyyy h:mm:ss aa").withLocale(Locale.ENGLISH).withZone(DateTimeZone.getDefault()));
            } catch (IllegalInstantException e4) {
                i2.a.j(i2.f36769a, "SegmentDetailsDTO", a0.j("Illegal Instant [", segmentDetailsDTO.f41282w, "] ", e4.getLocalizedMessage()));
                dateTime = null;
            } catch (IllegalArgumentException e14) {
                i2.a.j(i2.f36769a, "SegmentDetailsDTO", a0.j("Illegal Input [", segmentDetailsDTO.f41282w, "] ", e14.getLocalizedMessage()));
                dateTime = null;
            }
            if (dateTime != null) {
                strI = com.nimbusds.jose.shaded.gson.internal.a.i("M/d/yy", dateTime);
                strI2 = com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d, yyyy", dateTime);
            } else {
                String str = segmentDetailsDTO.f41282w;
                if (str == null) {
                    str = "";
                }
                strI = str;
                strI2 = strI;
            }
            textView.setText(context.getString(R.string.lbl_created) + StringUtils.SPACE + strI);
            x0 x0Var = x0.f105818a;
            textView.setContentDescription(String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.lbl_created), strI2}, 2)));
            imageView.setImageResource(z0.k(segmentDetailsDTO.f17839d, am.x0.f4346x).f4361d);
            imageView.setColorFilter(a7.b.getColor(context, R.color.gcm_list_activity_icon), PorterDuff.Mode.SRC_IN);
        }
    }
}
