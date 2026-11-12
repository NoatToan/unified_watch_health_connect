package hu1;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import fu1.q;
import fu1.u;
import g22.k;
import java.util.ArrayList;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import wt1.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhu1/c;", "Lcom/garmin/android/apps/connectmobile/f1;", "Lhu1/c$a;", "actionListener", "<init>", "(Lhu1/c$a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f85713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f85714d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ww1.h f85716f;

    public interface a {
        void a(long j8, boolean z14, boolean z15);

        void b(long j8, String str);
    }

    public c(a aVar) {
        this.f85713c = aVar;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f85714d.size();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x012e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x018b  */
    /* JADX WARN: Code duplicated, block: B:70:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        boolean z14;
        q qVar;
        Long activityId;
        q qVar2;
        q qVar3;
        Long workoutId;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        WorkoutDTO workoutDTO;
        String str;
        ArrayList arrayList = this.f85714d;
        u uVar = (u) arrayList.get(i14);
        if (i14 > 0) {
            z14 = k.f(uVar.f73556a, ((u) arrayList.get(i14 - 1)).f73556a);
        }
        if (f0Var instanceof p) {
            p pVar = (p) f0Var;
            LinearLayout linearLayout = pVar.f187117e;
            long j8 = this.f85715e;
            ww1.h hVar2 = this.f85716f;
            RelativeLayout relativeLayout = pVar.f187119g;
            ImageView imageView = pVar.f187118f;
            TextView textView = pVar.f187113a;
            TextView textView2 = pVar.f187114b;
            uVar.getClass();
            int dayOfMonth = uVar.f73556a.getDayOfMonth();
            DateTime.Property propertyDayOfWeek = uVar.f73556a.dayOfWeek();
            TextView textView3 = pVar.f187116d;
            textView3.setText(String.valueOf(dayOfMonth));
            TextView textView4 = pVar.f187115c;
            textView4.setText(propertyDayOfWeek.getAsShortText());
            if (uVar.f73558c == null) {
                z14 = z14;
                qVar = uVar.f73557b;
                if (qVar != null) {
                    activityId = qVar.getActivityId();
                } else {
                    activityId = null;
                }
                if (activityId != null) {
                    hVar = uVar.f73559d;
                    if (hVar != null || (str = hVar.f29449b) == null) {
                        workoutDTO = uVar.f73558c;
                        if (workoutDTO != null) {
                            str = workoutDTO.f48041b;
                        } else {
                            str = null;
                        }
                    }
                    textView.setText(str);
                    imageView.setImageResource(2131232218);
                    textView2.setText(R.string.lbl_completed);
                    textView2.setVisibility(0);
                    imageView.setVisibility(0);
                    textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
                } else {
                    qVar2 = uVar.f73557b;
                    if (qVar2 == null) {
                        v22.e.j(textView2);
                        textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_secondary));
                        textView.setText(R.string.lbl_rest_day);
                        v22.e.j(imageView);
                    } else if (qVar2 != null && qVar2.getActivityId() == null) {
                        qVar3 = uVar.f73557b;
                        if (qVar3 != null) {
                            workoutId = qVar3.getWorkoutId();
                        } else {
                            workoutId = null;
                        }
                        if (workoutId == null) {
                            textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
                            textView.setText(R.string.lbl_workout);
                            v22.e.q(textView2);
                            textView2.setText(R.string.lbl_stay_tuned_for_details);
                            v22.e.q(imageView);
                        }
                    }
                }
            } else {
                q qVar4 = uVar.f73557b;
                if ((qVar4 != null ? qVar4.getActivityId() : null) == null) {
                    v22.e.q(textView2);
                    v22.e.q(imageView);
                    textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
                    WorkoutDTO workoutDTO2 = uVar.f73558c;
                    if ((workoutDTO2 != null ? workoutDTO2.f48041b : null) != null) {
                        textView.setText(workoutDTO2 != null ? workoutDTO2.f48041b : null);
                    } else {
                        textView.setText(R.string.lbl_workout);
                    }
                    WorkoutDTO workoutDTO3 = uVar.f73558c;
                    Integer num = workoutDTO3 != null ? workoutDTO3.f48049j : null;
                    if (num != null && num.intValue() != 0) {
                        double dIntValue = num.intValue();
                        l3.f23124b.getClass();
                        String string = textView2.getContext().getString(R.string.common_minutes_abbreviation_label, String.valueOf((int) (dIntValue / 60.0d)));
                        string.getClass();
                        textView2.setText(string);
                    }
                    WorkoutDTO workoutDTO4 = uVar.f73558c;
                    if (workoutDTO4 != null && workoutDTO4.f48040a == j8) {
                        String string2 = textView2.getContext().getString(R.string.lbl_next_workout);
                        string2.getClass();
                        CharSequence text = textView2.getText();
                        text.getClass();
                        if (text.length() == 0) {
                            textView2.setText(string2);
                        } else {
                            String string3 = textView2.getContext().getString(R.string.string_space_bullet_string_pattern, string2, text);
                            string3.getClass();
                            textView2.setText(string3);
                        }
                    }
                } else {
                    z14 = z14;
                    qVar = uVar.f73557b;
                    if (qVar != null) {
                        activityId = qVar.getActivityId();
                    } else {
                        activityId = null;
                    }
                    if (activityId != null) {
                        hVar = uVar.f73559d;
                        if (hVar != null) {
                            workoutDTO = uVar.f73558c;
                            if (workoutDTO != null) {
                                str = workoutDTO.f48041b;
                            } else {
                                str = null;
                            }
                        } else {
                            workoutDTO = uVar.f73558c;
                            if (workoutDTO != null) {
                                str = workoutDTO.f48041b;
                            } else {
                                str = null;
                            }
                        }
                        textView.setText(str);
                        imageView.setImageResource(2131232218);
                        textView2.setText(R.string.lbl_completed);
                        textView2.setVisibility(0);
                        imageView.setVisibility(0);
                        textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
                    } else {
                        qVar2 = uVar.f73557b;
                        if (qVar2 == null) {
                            v22.e.j(textView2);
                            textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_secondary));
                            textView.setText(R.string.lbl_rest_day);
                            v22.e.j(imageView);
                        } else if (qVar2 != null) {
                            qVar3 = uVar.f73557b;
                            if (qVar3 != null) {
                                workoutId = qVar3.getWorkoutId();
                            } else {
                                workoutId = null;
                            }
                            if (workoutId == null) {
                                textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
                                textView.setText(R.string.lbl_workout);
                                v22.e.q(textView2);
                                textView2.setText(R.string.lbl_stay_tuned_for_details);
                                v22.e.q(imageView);
                            }
                        }
                    }
                }
            }
            j0 j0Var = j0.f23099a;
            DateTime dateTime = uVar.f73556a;
            DateTime dateTimeB = hVar2 != null ? hVar2.b() : null;
            j0Var.getClass();
            if (j0.F(dateTime, dateTimeB)) {
                textView.setText(hVar2 != null ? hVar2.getRaceName() : null);
                textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
                textView2.setText((CharSequence) null);
                v22.e.q(imageView);
            }
            if (j0.F(DateTime.now(), uVar.f73556a)) {
                linearLayout.setBackgroundColor(a7.b.getColor(linearLayout.getContext(), R.color.gcm_button_primary));
                textView4.setTextColor(a7.b.getColor(textView4.getContext(), R.color.gcm_text_on_color));
                textView3.setTextColor(a7.b.getColor(textView4.getContext(), R.color.gcm_text_on_color));
                if (uVar.f73557b == null) {
                    relativeLayout.setBackgroundColor(a7.b.getColor(relativeLayout.getContext(), R.color.gcm_surface_3));
                } else {
                    relativeLayout.setBackground(a7.b.getDrawable(relativeLayout.getContext(), R.drawable.gcm3_highlighted_list_item_selector));
                }
            } else {
                linearLayout.setBackgroundColor(a7.b.getColor(linearLayout.getContext(), R.color.gcm_surface_2));
                textView4.setTextColor(a7.b.getColor(textView4.getContext(), R.color.gcm_text_primary_action));
                textView3.setTextColor(a7.b.getColor(textView4.getContext(), R.color.gcm_text_primary));
                if (uVar.f73557b == null) {
                    relativeLayout.setBackgroundColor(a7.b.getColor(relativeLayout.getContext(), R.color.gcm_list_item_background));
                } else {
                    relativeLayout.setBackground(a7.b.getDrawable(relativeLayout.getContext(), R.drawable.gcm_surface_1_selector_background));
                }
            }
            if (z14) {
                v22.e.l(linearLayout);
            } else {
                v22.e.q(linearLayout);
            }
            pVar.itemView.setOnClickListener(new cw2.b(28, uVar, this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new p(viewGroup);
    }
}
