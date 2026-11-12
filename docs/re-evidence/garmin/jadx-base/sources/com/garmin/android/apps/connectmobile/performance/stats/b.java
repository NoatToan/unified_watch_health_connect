package com.garmin.android.apps.connectmobile.performance.stats;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f40042b = DateTimeFormat.forPattern("MMM d, yyyy").withLocale(Locale.getDefault());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f40043a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f40044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f40045b;

        public a(View view2, View.OnClickListener onClickListener) {
            if (view2 != null) {
                this.f40044a = (TextView) view2.findViewById(R.id.text1);
                this.f40045b = (TextView) view2.findViewById(R.id.text2);
                view2.setOnClickListener(onClickListener);
            }
        }
    }

    public b(m mVar) {
        this.f40043a = mVar;
    }
}
