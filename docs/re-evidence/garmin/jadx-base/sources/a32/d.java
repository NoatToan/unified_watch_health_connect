package a32;

import am.l;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d<T> extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<T> f939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f940b;

    public abstract String ca();

    public abstract l da();

    public abstract ArrayList ea(List list);

    public abstract ArrayList fa(List list);

    public abstract List<T> ga();

    public abstract Intent ha(T t7);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        c<T> cVar = this.f939a;
        Object item = cVar.getItem(cVar.f929b);
        if (item != this.f940b) {
            setResult(-1, ha(item));
        } else {
            setResult(0, null);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_list_view_generic);
        initActionBar(true, ca());
        ListView listView = (ListView) findViewById(R.id.gcm_list);
        listView.setDividerHeight(0);
        c<T> cVar = new c<>(this);
        this.f939a = cVar;
        listView.setAdapter((ListAdapter) cVar);
        this.f940b = (T) da();
        List<T> listGa = ga();
        this.f939a.a(listGa, fa(listGa), ea(listGa), this.f940b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        c<T> cVar = this.f939a;
        Object item = cVar.getItem(cVar.f929b);
        if (item != this.f940b) {
            setResult(-1, ha(item));
        } else {
            setResult(0, null);
        }
        finish();
        return true;
    }
}
