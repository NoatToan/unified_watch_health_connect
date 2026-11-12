package com.huami.watch.companion.watchface;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.pnikosis.materialishprogress.ProgressWheel;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceAdapter extends ArrayAdapter<WatchFace> {
    private int a;
    private boolean b;
    private String c;
    private HashMap<String, String> d;
    private boolean e;
    private e f;

    public class a implements Runnable {
        public final /* synthetic */ ProgressWheel a;

        public a(ProgressWheel progressWheel) {
            this.a = progressWheel;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressWheel progressWheel = this.a;
            if (progressWheel == null || !progressWheel.isSpinning()) {
                return;
            }
            Log.d("WatchFaceAdapter", "spin time out, remove spinning state");
            this.a.stopSpinning();
            this.a.setInstantProgress(0.0f);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ WatchFace a;

        public b(WatchFace watchFace) {
            this.a = watchFace;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                HashMap map = WatchFaceAdapter.this.d;
                WatchFace watchFace = this.a;
                map.put(watchFace.serviceName, watchFace.packageName);
            } else {
                WatchFaceAdapter.this.d.remove(this.a.serviceName);
            }
            if (WatchFaceAdapter.this.f != null) {
                WatchFaceAdapter.this.f.a(WatchFaceAdapter.this.d.size());
            }
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ Device a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ WatchFace c;
        public final /* synthetic */ WatchFace d;
        public final /* synthetic */ ProgressWheel e;
        public final /* synthetic */ Runnable f;

        public c(Device device, Context context, WatchFace watchFace, WatchFace watchFace2, ProgressWheel progressWheel, Runnable runnable) {
            this.a = device;
            this.b = context;
            this.c = watchFace;
            this.d = watchFace2;
            this.e = progressWheel;
            this.f = runnable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Device device = this.a;
            if (device == null) {
                Context context = this.b;
                Toast.makeText(context, context.getString(R.string.set_watch_face_unbound), 0).show();
                return;
            }
            if (device.isConnected()) {
                WatchFace watchFace = this.c;
                if (watchFace == null || !watchFace.packageName.equals(this.d.packageName) || !this.c.serviceName.equals(this.d.serviceName)) {
                    Context context2 = this.b;
                    WatchFace watchFace2 = this.d;
                    SyncUtil.syncWatchFaceToWatch(context2, watchFace2.packageName, watchFace2.serviceName);
                    ProgressWheel progressWheel = this.e;
                    if (progressWheel != null) {
                        progressWheel.spin();
                        this.e.postDelayed(this.f, 5000L);
                    }
                }
            } else {
                Context context3 = this.b;
                Toast.makeText(context3, context3.getString(R.string.set_watch_face_disconnected), 0).show();
            }
            Context context4 = this.b;
            if (context4 instanceof WatchFaceActivity) {
                Analytics.event(context4, "WatchFace", 1);
            } else {
                Analytics.event(context4, AnalyticsEvents.EVENT_MAIN_PAGE_WATCH_FACE_CLICKED, 1);
            }
        }
    }

    public class d implements ProgressWheel.ProgressCallback {
        public final /* synthetic */ ProgressWheel a;

        public d(ProgressWheel progressWheel) {
            this.a = progressWheel;
        }

        @Override // com.pnikosis.materialishprogress.ProgressWheel.ProgressCallback
        public void onProgressUpdate(float f) {
            if (f == 0.0f) {
                this.a.setProgress(1.0f);
            }
        }
    }

    public interface e {
        void a(int i);
    }

    public WatchFaceAdapter(Context context, int i, boolean z, String str) {
        super(context, i);
        this.e = false;
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = new HashMap<>();
    }

    public void allSelect() {
        List<WatchFace> all = WatchFaceManager.getManager().getAll(this.c);
        if (all.isEmpty()) {
            all = WatchFaceManager.getManager().getDefault(getContext(), this.c);
        }
        int size = all.size();
        for (int i = 0; i < size; i++) {
            WatchFace watchFace = all.get(i);
            this.d.put(watchFace.serviceName, watchFace.packageName);
        }
        notifyDataSetChanged();
        e eVar = this.f;
        if (eVar != null) {
            eVar.a(this.d.size());
        }
    }

    public void enterEditMode() {
        this.e = true;
        notifyDataSetChanged();
    }

    public void exitEditMode() {
        this.e = false;
        this.d.clear();
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        boolean z;
        Context context = getContext();
        View viewInflate = view == null ? LayoutInflater.from(context).inflate(this.a, viewGroup, false) : view;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.watchface_preview_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.watchface_title);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkbox);
        imageView.setSelected(false);
        textView.setSelected(false);
        ProgressWheel progressWheel = (ProgressWheel) viewInflate.findViewById(R.id.progress_wheel);
        a aVar = new a(progressWheel);
        if (progressWheel != null && !progressWheel.isSpinning()) {
            progressWheel.setInstantProgress(0.0f);
            progressWheel.removeCallbacks(aVar);
        }
        if (getCount() > i) {
            WatchFace item = getItem(i);
            WatchFace selectedWatchFace = WatchFaceManager.getManager().getSelectedWatchFace(context, false, this.c);
            Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
            if (item != null) {
                if (this.e) {
                    checkBox.setVisibility(0);
                    if (this.d.containsKey(item.serviceName)) {
                        checkBox.setChecked(true);
                    } else {
                        checkBox.setChecked(false);
                    }
                    checkBox.setOnCheckedChangeListener(new b(item));
                } else {
                    checkBox.setVisibility(8);
                }
                if (this.b) {
                    boolean z2 = context instanceof Activity;
                } else {
                    byte[] bArr = item.previewThumb;
                    imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                }
                viewInflate.setOnClickListener(new c(currentDevice, context, selectedWatchFace, item, progressWheel, aVar));
                textView.setText(item.label);
            }
            if (currentDevice != null && selectedWatchFace != null && selectedWatchFace.packageName.equals(item.packageName) && selectedWatchFace.serviceName.equals(item.serviceName)) {
                if (progressWheel == null || !progressWheel.isSpinning()) {
                    z = true;
                    imageView.setSelected(true);
                } else {
                    progressWheel.stopSpinning();
                    progressWheel.setCallback(new d(progressWheel));
                    z = true;
                }
                textView.setSelected(z);
            }
        }
        return viewInflate;
    }

    public boolean isEditMode() {
        return this.e;
    }

    public void setSelectListener(e eVar) {
        this.f = eVar;
    }
}
