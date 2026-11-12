package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes.dex */
public final class si8 extends Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33662a;

    public si8(Context context, List<Preference> list, long j) {
        super(context);
        e();
        h(list);
        this.f33662a = j + FolmeCore.NANOS_TO_MS;
    }

    public final void e() {
        setLayoutResource(kui.f24307a);
        setIcon(koi.f24051a);
        setTitle(e0j.f16129b);
        setOrder(999);
    }

    @Override // androidx.preference.Preference
    public long getId() {
        return this.f33662a;
    }

    public final void h(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence title = preference.getTitle();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(title)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.getParent())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(title)) {
                string = string == null ? title : getContext().getString(e0j.e, string, title);
            }
        }
        setSummary(string);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        g7iVar.e(false);
    }
}
