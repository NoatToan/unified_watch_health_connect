package xl0;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class a extends LinearLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f191304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f191305b;

    public a(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.gcm_golf_truswing_club_selection_row, this);
        this.f191304a = (TextView) findViewById(R.id.golf_club_name);
        this.f191305b = (ImageView) findViewById(R.id.golf_club_selected_icon);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        ImageView imageView = this.f191305b;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z14) {
        ImageView imageView = this.f191305b;
        if (imageView != null) {
            imageView.setVisibility(z14 ? 0 : 4);
        }
        TextView textView = this.f191304a;
        if (textView != null) {
            textView.setTextColor(getContext().getColor(z14 ? R.color.gcm_golf_text_accent : R.color.gcm_text_primary));
        }
    }

    public void setClubName(String str) {
        TextView textView = this.f191304a;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
