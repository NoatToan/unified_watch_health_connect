package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.sport.SportSortManager;
import com.huami.watch.companion.ui.activity.SportItemSortActivity;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class SportItemSortActivity extends Activity {
    public static final String KEY_DEVICE_MODEL = "deviceModel";
    public static final String KEY_SPORT = "sportKey";
    public static final String KEY_SPORT_EVENT = "sportEvent";
    public static final String KEY_SPORT_INDEX = "sportIndex";
    public static final String KEY_SPORT_NAME = "sportName";
    public static final String KEY_SUPPORT_HIDE = "supportHide";
    public static final String TAG = "SportItemSortActivity";
    private static final String r = ".closed";
    private static final int s = 4;
    private SportSortManager a;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Transporter j;
    private Disposable k;
    private RecyclerView l;
    private c m;
    private ItemTouchHelper n;
    private List<SportItemData> b = new ArrayList();
    private List<SportItemData> c = new ArrayList();
    private List<SportItemData> d = new ArrayList();
    private boolean o = true;
    private boolean p = false;
    private boolean q = false;

    public static class SportItemData {
        private String a;
        private int b;
        private boolean c;
        private boolean d;

        public SportItemData(String str, int i) {
            this(str, i, false, true);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof SportItemData)) {
                return super.equals(obj);
            }
            return this.b == ((SportItemData) obj).b;
        }

        public int getIndex() {
            return this.b;
        }

        public String getName() {
            return this.a;
        }

        public void setIndex(int i) {
            this.b = i;
        }

        public void setName(String str) {
            this.a = str;
        }

        public SportItemData(String str, int i, boolean z, boolean z2) {
            this.c = false;
            this.d = true;
            this.a = str;
            this.b = i;
            this.c = z;
            if (!z2 || i == 1 || i == 2 || i == 22 || i == 29 || i == 56) {
                this.d = false;
            }
            if ((i < 32 || i >= 38) && (i < 45 || i > 50)) {
                return;
            }
            this.c = true;
        }
    }

    public class a extends ItemTouchHelper.Callback {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            SportItemSortActivity.this.m.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        /* JADX INFO: renamed from: isLongPressDragEnabled */
        public boolean getIsEnableDrag() {
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if ((viewHolder2 instanceof c.e) || (viewHolder2 instanceof c.b) || (viewHolder instanceof c.e)) {
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            Collections.swap(SportItemSortActivity.this.c, adapterPosition - 1, adapterPosition2 - 1);
            SportItemSortActivity.this.m.notifyItemMoved(adapterPosition, adapterPosition2);
            SportSortManager manager = SportSortManager.getManager();
            SportItemSortActivity sportItemSortActivity = SportItemSortActivity.this;
            manager.saveItemOrder(sportItemSortActivity, sportItemSortActivity.f, SportItemSortActivity.this.A(), SportItemSortActivity.this.z(), SportItemSortActivity.this.h);
            SportItemSortActivity.this.a.syncDataToWatch(SportItemSortActivity.this.e, SportItemSortActivity.this.B(), SportItemSortActivity.this.j);
            SportItemSortActivity sportItemSortActivity2 = SportItemSortActivity.this;
            Analytics.event(sportItemSortActivity2, sportItemSortActivity2.i, 1);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            super.onSelectedChanged(viewHolder, i);
            if (viewHolder == null) {
                SportItemSortActivity.this.l.post(new Runnable() { // from class: com.huami.watch.companion.ui.activity.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }

    public class b implements Consumer<Object> {
        public b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(@NonNull Object obj) throws Exception {
            if (obj instanceof DisconnectedEvent) {
                if (DeviceManager.getManager(SportItemSortActivity.this).getCurrentDevice() == null) {
                    return;
                }
                SportItemSortActivity.this.M();
            } else if (obj instanceof ConnectedEvent) {
                SportItemSortActivity.this.L();
            }
        }
    }

    public class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static final int b = 0;
        private static final int c = 1;
        private static final int d = 2;
        private static final int e = 3;

        public class a implements View.OnLongClickListener {
            public final /* synthetic */ d a;

            public a(d dVar) {
                this.a = dVar;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (!SportItemSortActivity.this.o) {
                    return true;
                }
                SportItemSortActivity.this.n.startDrag(this.a);
                return true;
            }
        }

        public class b extends d {
            public b(View view) {
                super(view);
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.companion.ui.activity.SportItemSortActivity$c$c, reason: collision with other inner class name */
        public class C0660c extends e {
            public C0660c(View view) {
                super(view);
                this.a.setText(R.string.more_sport_item);
                if (SportItemSortActivity.this.p) {
                    this.a.setVisibility(0);
                } else {
                    this.a.setVisibility(8);
                }
            }
        }

        public class d extends RecyclerView.ViewHolder {
            public TextView a;
            public Switch b;
            public View c;

            public d(View view) {
                super(view);
                this.c = view.findViewById(R.id.sport_item);
                this.a = (TextView) view.findViewById(R.id.text);
                this.b = (Switch) view.findViewById(R.id.item_switch);
            }
        }

        public class e extends RecyclerView.ViewHolder {
            public TextView a;

            public e(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.title);
                SportItemSortActivity sportItemSortActivity = SportItemSortActivity.this;
                String string = sportItemSortActivity.getString(R.string.sport_sort_drag_tip, new Object[]{sportItemSortActivity.g});
                if (SportItemSortActivity.this.p) {
                    string = SportItemSortActivity.this.getString(R.string.real_time_sport_item_title) + "\n" + string;
                }
                this.a.setText(string);
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i, CompoundButton compoundButton, boolean z) {
            if (z) {
                SportItemSortActivity.this.c.add((SportItemData) SportItemSortActivity.this.d.remove(i));
                notifyDataSetChanged();
                SportSortManager manager = SportSortManager.getManager();
                SportItemSortActivity sportItemSortActivity = SportItemSortActivity.this;
                manager.saveItemOrder(sportItemSortActivity, sportItemSortActivity.f, SportItemSortActivity.this.A(), SportItemSortActivity.this.z(), SportItemSortActivity.this.h);
                SportItemSortActivity.this.a.syncDataToWatch(SportItemSortActivity.this.e, SportItemSortActivity.this.B(), SportItemSortActivity.this.j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(int i, CompoundButton compoundButton, boolean z) {
            if (z) {
                return;
            }
            if (SportItemSortActivity.this.q && SportItemSortActivity.this.c.size() <= 4) {
                SportItemSortActivity.this.P();
                compoundButton.setChecked(true);
                return;
            }
            SportItemSortActivity.this.d.add((SportItemData) SportItemSortActivity.this.c.remove(i - 1));
            notifyDataSetChanged();
            SportSortManager manager = SportSortManager.getManager();
            SportItemSortActivity sportItemSortActivity = SportItemSortActivity.this;
            manager.saveItemOrder(sportItemSortActivity, sportItemSortActivity.f, SportItemSortActivity.this.A(), SportItemSortActivity.this.z(), SportItemSortActivity.this.h);
            SportItemSortActivity.this.a.syncDataToWatch(SportItemSortActivity.this.e, SportItemSortActivity.this.B(), SportItemSortActivity.this.j);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return (SportItemSortActivity.this.c != null ? SportItemSortActivity.this.c.size() : 0) + (SportItemSortActivity.this.d != null ? SportItemSortActivity.this.d.size() : 0) + 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int size = SportItemSortActivity.this.c.size();
            if (i == 0) {
                return 0;
            }
            if (i <= size) {
                return 1;
            }
            return i == size + 1 ? 2 : 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
            if (viewHolder instanceof b) {
                final int size = (i - SportItemSortActivity.this.c.size()) - 2;
                if (size < 0 || size >= SportItemSortActivity.this.d.size()) {
                    return;
                }
                b bVar = (b) viewHolder;
                bVar.a.setText(((SportItemData) SportItemSortActivity.this.d.get(size)).getName());
                bVar.b.setChecked(false);
                bVar.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huami.watch.companion.ui.activity.d
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        this.a.c(size, compoundButton, z);
                    }
                });
                return;
            }
            if (viewHolder instanceof d) {
                SportItemData sportItemData = (SportItemData) SportItemSortActivity.this.c.get(i - 1);
                d dVar = (d) viewHolder;
                dVar.a.setText(sportItemData.getName());
                dVar.b.setChecked(true);
                dVar.c.setOnLongClickListener(new a(dVar));
                if (!SportItemSortActivity.this.p) {
                    dVar.b.setVisibility(8);
                } else if (!sportItemData.d && !SportItemSortActivity.this.q) {
                    dVar.b.setVisibility(8);
                } else {
                    dVar.b.setVisibility(0);
                    dVar.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huami.watch.companion.ui.activity.e
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            this.a.d(i, compoundButton, z);
                        }
                    });
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(SportItemSortActivity.this.getApplicationContext());
            if (i == 0) {
                return new e(layoutInflaterFrom.inflate(R.layout.sport_item_sorted_title, viewGroup, false));
            }
            if (i == 1) {
                return new d(layoutInflaterFrom.inflate(R.layout.sport_item_closed_item, viewGroup, false));
            }
            if (i != 2) {
                return i != 3 ? new d(layoutInflaterFrom.inflate(R.layout.sport_item_sorted_title, viewGroup, false)) : new b(layoutInflaterFrom.inflate(R.layout.sport_item_closed_item, viewGroup, false));
            }
            return new C0660c(layoutInflaterFrom.inflate(R.layout.sport_item_sorted_title, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SportItemData> A() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.c);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] B() {
        List<SportItemData> listA = A();
        byte[] bArr = new byte[listA.size()];
        for (int i = 0; i < listA.size(); i++) {
            bArr[i] = (byte) listA.get(i).getIndex();
        }
        return bArr;
    }

    private void C() {
        this.k = RxBus.get().toObservable().subscribe(new b(), new Consumer() { // from class: oa7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SportItemSortActivity.I((Throwable) obj);
            }
        });
    }

    private void D() {
        boolean z;
        Transporter transporter = Transporter.get(this, "com.huami.watch.sport");
        this.j = transporter;
        transporter.connectTransportService();
        SportSortManager manager = SportSortManager.getManager();
        this.a = manager;
        manager.restoreSportOrder(this, this.h);
        this.b.addAll(this.a.generateSportItemData(this, this.f, this.h));
        byte[] sportOrder = this.a.getSportOrder(this, this.f, this.h);
        byte[] sportOrder2 = this.a.getSportOrder(this, this.f + r, this.h);
        Log.d("liyu", "mSportKey:" + this.f, new Object[0]);
        SparseIntArray sparseIntArray = new SparseIntArray();
        if (sportOrder != null) {
            z = false;
            for (int i = 0; i < sportOrder.length; i++) {
                for (SportItemData sportItemData : this.b) {
                    if (sportItemData.getIndex() == sportOrder[i]) {
                        if (sparseIntArray.get(sportOrder[i], -10) != -10) {
                            z = true;
                            break;
                        } else {
                            sparseIntArray.put(sportOrder[i], i);
                            this.c.add(sportItemData);
                            break;
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        if (sportOrder2 != null && !z) {
            for (int i2 = 0; i2 < sportOrder2.length; i2++) {
                for (SportItemData sportItemData2 : this.b) {
                    if (sportItemData2.getIndex() == sportOrder2[i2]) {
                        if (sparseIntArray.get(sportOrder2[i2], -10) != -10) {
                            z = true;
                            break;
                        } else {
                            sparseIntArray.put(sportOrder2[i2], i2);
                            this.d.add(sportItemData2);
                            break;
                        }
                    }
                }
            }
        }
        if (z || (sportOrder == null && sportOrder2 == null)) {
            this.c.clear();
            this.d.clear();
            for (SportItemData sportItemData3 : this.b) {
                if (sportItemData3.c) {
                    this.d.add(sportItemData3);
                } else {
                    this.c.add(sportItemData3);
                }
            }
        }
        if (this.d.size() + this.c.size() != this.b.size()) {
            this.d.clear();
            for (SportItemData sportItemData4 : this.b) {
                if (sportItemData4.c) {
                    this.d.add(sportItemData4);
                } else if (!this.c.contains(sportItemData4)) {
                    this.c.add(sportItemData4);
                }
            }
        }
        if (!this.p) {
            this.d.clear();
        }
        this.a.saveItemOrder(this, this.f, this.c, this.d, this.h);
        this.a.syncDataToWatch(this.e, B(), this.j);
        c cVar = new c();
        this.m = cVar;
        this.l.setAdapter(cVar);
        C();
    }

    private void E() {
        Intent intent = getIntent();
        this.e = intent.getIntExtra(KEY_SPORT_INDEX, -1);
        this.g = intent.getStringExtra(KEY_SPORT_NAME);
        this.f = intent.getStringExtra(KEY_SPORT);
        this.h = intent.getStringExtra("deviceModel");
        this.i = intent.getStringExtra(KEY_SPORT_EVENT);
        this.p = intent.getBooleanExtra(KEY_SUPPORT_HIDE, false);
        int i = this.e;
        if (i == 12 || i == 10 || i == 16) {
            this.p = false;
        }
        this.q = DeviceSource.isModelQogir(this.h);
    }

    private void F() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(this.g);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: ma7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.J(view);
            }
        });
        actionbarLayout.setRightText(getString(R.string.reset_heart));
        actionbarLayout.setRightTextClickListener(new View.OnClickListener() { // from class: na7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.K(view);
            }
        });
    }

    private void G() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.l = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new a());
        this.n = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(Throwable th) throws Exception {
        HMLog.warn(TAG, th, new Function0() { // from class: pa7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportItemSortActivity.H();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        this.o = true;
        this.l.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        this.o = false;
        this.l.setAlpha(0.5f);
    }

    private void N() {
        this.o = false;
        this.l.setAlpha(0.5f);
    }

    private void O() {
        this.c.clear();
        this.d.clear();
        for (SportItemData sportItemData : this.b) {
            if (sportItemData.c) {
                this.d.add(sportItemData);
            } else {
                this.c.add(sportItemData);
            }
        }
        this.m.notifyDataSetChanged();
        this.a.saveItemOrder(this, this.f, this.c, this.d, this.h);
        this.a.syncDataToWatch(this.e, B(), this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        AlertDialog.setMessage(getString(R.string.sport_item_min_number_tips)).setNeutralBtn(getString(R.string.btn_known)).setCancelable(false).show(getFragmentManager(), "MIN_NUMBER_DIALOG");
    }

    public static void to(Context context, int i, String str, String str2, String str3, String str4, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SportItemSortActivity.class);
        intent.putExtra(KEY_SPORT_INDEX, i);
        intent.putExtra(KEY_SPORT_NAME, str);
        intent.putExtra(KEY_SPORT, str2);
        intent.putExtra(KEY_SPORT_EVENT, str3);
        intent.putExtra("deviceModel", str4);
        intent.putExtra(KEY_SUPPORT_HIDE, z);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SportItemData> z() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        return arrayList;
    }

    public void checkDeviceState() {
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice == null) {
            N();
        } else if (currentDevice.isConnected()) {
            L();
        } else {
            M();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sport_item_sort);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        E();
        F();
        G();
        D();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.k.dispose();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
        checkDeviceState();
    }
}
