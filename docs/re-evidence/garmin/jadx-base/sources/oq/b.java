package oq;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.pickers.ExerciseWeightPickerActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loq/b;", "Landroid/text/TextWatcher;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExerciseWeightPickerActivity f133261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.c f133262b;

    public b(ExerciseWeightPickerActivity exerciseWeightPickerActivity, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        this.f133261a = exerciseWeightPickerActivity;
        this.f133262b = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        ExerciseWeightPickerActivity exerciseWeightPickerActivity = this.f133261a;
        EditText editTextCa = exerciseWeightPickerActivity.ca();
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f133262b;
        editTextCa.setHint(exerciseWeightPickerActivity.fa(cVar) ? exerciseWeightPickerActivity.getString(R.string.strength_training_body) : "");
        exerciseWeightPickerActivity.da().setVisibility(exerciseWeightPickerActivity.fa(cVar) ? 8 : 0);
    }
}
