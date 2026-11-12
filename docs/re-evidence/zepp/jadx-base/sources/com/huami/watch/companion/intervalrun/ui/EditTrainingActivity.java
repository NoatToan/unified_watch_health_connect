package com.huami.watch.companion.intervalrun.ui;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.intervalrun.model.IntervalGroupInfo;
import com.huami.watch.companion.intervalrun.model.IntervalItemInfo;
import com.huami.watch.companion.intervalrun.model.IntervalTrainingInfo;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.sport.ui.fragment.MenuFragment;
import com.huami.watch.companion.sport.utils.SportFormatUtils;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.widget.wheelview.OnWheelChangedListener;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class EditTrainingActivity extends FragmentActivity {
    private static final int A = 1;
    private static final String B = "EditTrainingActivity";
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 0;
    private ActionbarLayout a;
    private RecyclerView b;
    private v c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private EditText j;
    private IntervalTrainingInfo k;
    private IntervalTrainingInfo l;
    private String o;
    private Map<Long, IntervalItemInfo> p;
    private int m = -1;
    private boolean n = false;
    private boolean q = false;
    private boolean r = true;
    private boolean s = false;

    public class a implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public a(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditTrainingActivity.this.finish();
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public c(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class d implements MenuFragment.MenuClickListener {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ IntervalItemInfo c;
        public final /* synthetic */ MenuFragment d;

        public d(long j, int i, IntervalItemInfo intervalItemInfo, MenuFragment menuFragment) {
            this.a = j;
            this.b = i;
            this.c = intervalItemInfo;
            this.d = menuFragment;
        }

        @Override // com.huami.watch.companion.sport.ui.fragment.MenuFragment.MenuClickListener
        public void onClickMenu(int i) {
            if (i == 0) {
                EditTrainingActivity editTrainingActivity = EditTrainingActivity.this;
                editTrainingActivity.O(editTrainingActivity.getString(R.string.training_mileage_picker_title), 0, this.a, this.b);
            } else if (i == 1) {
                EditTrainingActivity editTrainingActivity2 = EditTrainingActivity.this;
                editTrainingActivity2.O(editTrainingActivity2.getString(R.string.training_time_picker_title), 1, this.a, this.b);
            } else if (i == 2) {
                this.c.setLengthType(2);
                this.c.setLengthValue(-1);
                EditTrainingActivity.this.c.notifyDataSetChanged();
                EditTrainingActivity.this.U();
            }
            this.d.dismissAllowingStateLoss();
        }
    }

    public class e implements MenuFragment.MenuClickListener {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ IntervalItemInfo c;
        public final /* synthetic */ MenuFragment d;

        public e(long j, int i, IntervalItemInfo intervalItemInfo, MenuFragment menuFragment) {
            this.a = j;
            this.b = i;
            this.c = intervalItemInfo;
            this.d = menuFragment;
        }

        @Override // com.huami.watch.companion.sport.ui.fragment.MenuFragment.MenuClickListener
        public void onClickMenu(int i) {
            if (i == 0) {
                EditTrainingActivity editTrainingActivity = EditTrainingActivity.this;
                editTrainingActivity.O(editTrainingActivity.getString(R.string.training_pace_picker_title), 2, this.a, this.b);
            } else if (i == 1) {
                EditTrainingActivity.this.R(this.a, this.b);
            } else if (i == 2) {
                this.c.setReminderType(5);
                this.c.setReminderValue(null);
                EditTrainingActivity.this.c.notifyDataSetChanged();
                EditTrainingActivity.this.U();
            }
            this.d.dismissAllowingStateLoss();
        }
    }

    public class f implements OnWheelChangedListener {
        public final /* synthetic */ TrainingPickerFragment a;
        public final /* synthetic */ AlertDialogFragment b;
        public final /* synthetic */ String c;

        public f(TrainingPickerFragment trainingPickerFragment, AlertDialogFragment alertDialogFragment, String str) {
            this.a = trainingPickerFragment;
            this.b = alertDialogFragment;
            this.c = str;
        }

        @Override // com.huami.widget.wheelview.OnWheelChangedListener
        public void onChanged(WheelView wheelView, int i, int i2) {
            double[] pickerValue = this.a.getPickerValue();
            AlertDialogFragment alertDialogFragment = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("\n");
            sb.append(EditTrainingActivity.this.getString(R.string.training_repeat_value_title, new Object[]{((int) pickerValue[1]) + ""}));
            alertDialogFragment.setTitle(sb.toString());
        }
    }

    public class g implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;
        public final /* synthetic */ TrainingPickerFragment b;
        public final /* synthetic */ long c;

        public class a implements Comparator<IntervalItemInfo> {
            public a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(IntervalItemInfo intervalItemInfo, IntervalItemInfo intervalItemInfo2) {
                return EditTrainingActivity.this.G(intervalItemInfo.getGroupId()) - EditTrainingActivity.this.G(intervalItemInfo2.getGroupId());
            }
        }

        public g(AlertDialogFragment alertDialogFragment, TrainingPickerFragment trainingPickerFragment, long j) {
            this.a = alertDialogFragment;
            this.b = trainingPickerFragment;
            this.c = j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
            double[] pickerValue = this.b.getPickerValue();
            long j = this.c;
            if (j > 0) {
                EditTrainingActivity.this.H(j).setRepeatCount((int) pickerValue[1]);
            } else {
                EditTrainingActivity.this.a.setTitleText(EditTrainingActivity.this.getString(R.string.training_setting_repeat));
                List<IntervalGroupInfo> groupList = EditTrainingActivity.this.k.getGroupList();
                ArrayList arrayList = new ArrayList();
                if (EditTrainingActivity.this.p.size() > 0) {
                    ArrayList<IntervalItemInfo> arrayList2 = new ArrayList();
                    arrayList2.addAll(EditTrainingActivity.this.p.values());
                    Collections.sort(arrayList2, new a());
                    IntervalItemInfo intervalItemInfo = (IntervalItemInfo) arrayList2.get(0);
                    IntervalGroupInfo intervalGroupInfoH = EditTrainingActivity.this.H(intervalItemInfo.getGroupId());
                    for (IntervalItemInfo intervalItemInfo2 : arrayList2) {
                        if (intervalItemInfo2.getGroupId() != intervalItemInfo.getGroupId()) {
                            groupList.remove(EditTrainingActivity.this.H(intervalItemInfo2.getGroupId()));
                        }
                        intervalItemInfo2.setGroupId(intervalGroupInfoH.getGroupId());
                        arrayList.add(intervalItemInfo2);
                        intervalItemInfo = intervalItemInfo2;
                    }
                    intervalGroupInfoH.setItemInfoList(arrayList);
                    intervalGroupInfoH.setRepeatCount((int) pickerValue[1]);
                }
            }
            EditTrainingActivity.this.p.clear();
            EditTrainingActivity.this.f.setEnabled(false);
            EditTrainingActivity.this.c.notifyDataSetChanged();
        }
    }

    public class h implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public h(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class i implements OnWheelChangedListener {
        public final /* synthetic */ AlertDialogFragment a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TrainingPickerFragment d;

        public i(AlertDialogFragment alertDialogFragment, String str, int i, TrainingPickerFragment trainingPickerFragment) {
            this.a = alertDialogFragment;
            this.b = str;
            this.c = i;
            this.d = trainingPickerFragment;
        }

        @Override // com.huami.widget.wheelview.OnWheelChangedListener
        public void onChanged(WheelView wheelView, int i, int i2) {
            this.a.setTitle(this.b + "\n" + EditTrainingActivity.this.I(this.c, this.d.getPickerValue()));
        }
    }

    public class j implements View.OnClickListener {
        public final /* synthetic */ TrainingPickerFragment a;
        public final /* synthetic */ long b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ AlertDialogFragment e;

        public j(TrainingPickerFragment trainingPickerFragment, long j, int i, int i2, AlertDialogFragment alertDialogFragment) {
            this.a = trainingPickerFragment;
            this.b = j;
            this.c = i;
            this.d = i2;
            this.e = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            double[] pickerValue = this.a.getPickerValue();
            IntervalItemInfo intervalItemInfo = EditTrainingActivity.this.H(this.b).getItemInfoList().get(this.c);
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.e.dismissAllowingStateLoss();
                        intervalItemInfo.setReminderType(3);
                        double[] dArr = new double[2];
                        if (EditTrainingActivity.this.q) {
                            dArr[0] = pickerValue[0] / 1000.0d;
                            dArr[1] = pickerValue[1] / 1000.0d;
                        } else {
                            dArr[0] = pickerValue[0] / 621.3712096214294d;
                            dArr[1] = pickerValue[1] / 621.3712096214294d;
                        }
                        intervalItemInfo.setReminderValue(dArr);
                    } else if (i == 3) {
                        this.e.dismissAllowingStateLoss();
                        intervalItemInfo.setReminderType(4);
                        intervalItemInfo.setReminderValue(pickerValue);
                    }
                } else if (pickerValue[1] <= 0.0d) {
                    Toast.makeText(EditTrainingActivity.this.getApplicationContext(), R.string.training_item_not_empty_tips, 0).show();
                } else {
                    this.e.dismissAllowingStateLoss();
                    intervalItemInfo.setLengthType(1);
                    intervalItemInfo.setLengthValue((int) pickerValue[1]);
                }
            } else if (pickerValue[1] <= 0.0d) {
                Toast.makeText(EditTrainingActivity.this.getApplicationContext(), R.string.training_mileage_invalid_tips, 0).show();
            } else {
                this.e.dismissAllowingStateLoss();
                intervalItemInfo.setLengthType(0);
                intervalItemInfo.setLengthValue((int) pickerValue[1]);
            }
            EditTrainingActivity.this.c.notifyDataSetChanged();
            EditTrainingActivity.this.U();
        }
    }

    public class k extends TypeToken<List<IntervalTrainingInfo>> {
        public k() {
        }
    }

    public class l implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public l(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class m implements MenuFragment.MenuClickListener {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ IntervalItemInfo c;
        public final /* synthetic */ MenuFragment d;

        public m(long j, int i, IntervalItemInfo intervalItemInfo, MenuFragment menuFragment) {
            this.a = j;
            this.b = i;
            this.c = intervalItemInfo;
            this.d = menuFragment;
        }

        @Override // com.huami.watch.companion.sport.ui.fragment.MenuFragment.MenuClickListener
        public void onClickMenu(int i) {
            if (i == 5) {
                EditTrainingActivity editTrainingActivity = EditTrainingActivity.this;
                editTrainingActivity.O(editTrainingActivity.getString(R.string.training_hr_picker_title), 3, this.a, this.b);
            } else {
                this.c.setReminderType(4);
                double d = i;
                this.c.setReminderValue(new double[]{d, d});
                EditTrainingActivity.this.c.notifyDataSetChanged();
                EditTrainingActivity.this.U();
            }
            this.d.dismissAllowingStateLoss();
        }
    }

    public class n implements View.OnTouchListener {
        public n() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            EditTrainingActivity.this.j.setCursorVisible(true);
            return false;
        }
    }

    public class o implements TextWatcher {
        public o() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditTrainingActivity.this.U();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditTrainingActivity.this.L();
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (EditTrainingActivity.this.n) {
                EditTrainingActivity.this.j.setCursorVisible(false);
                if (EditTrainingActivity.this.p.size() <= 0) {
                    return;
                }
                EditTrainingActivity.this.Q(-1L);
            }
        }
    }

    public class r extends ItemTouchHelper.Callback {
        public r() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            Collections.swap(EditTrainingActivity.this.k.getGroupList(), adapterPosition, adapterPosition2);
            EditTrainingActivity.this.c.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditTrainingActivity.this.D();
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditTrainingActivity.this.j.setCursorVisible(false);
            IntervalItemInfo intervalItemInfo = new IntervalItemInfo();
            if (!EditTrainingActivity.this.s) {
                intervalItemInfo.setType(0);
            }
            intervalItemInfo.setGroupId(System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            arrayList.add(intervalItemInfo);
            IntervalGroupInfo intervalGroupInfo = new IntervalGroupInfo();
            intervalGroupInfo.setGroupId(intervalItemInfo.getGroupId());
            intervalGroupInfo.setItemInfoList(arrayList);
            EditTrainingActivity.this.k.getGroupList().add(intervalGroupInfo);
            EditTrainingActivity.this.c.notifyDataSetChanged();
            EditTrainingActivity.this.d.setEnabled(true);
            EditTrainingActivity.this.U();
        }
    }

    public class u implements View.OnClickListener {
        public u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditTrainingActivity.this.onBackPressed();
        }
    }

    public class v extends RecyclerView.Adapter<c> {

        public class a implements View.OnClickListener {
            public final /* synthetic */ long a;

            public a(long j) {
                this.a = j;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditTrainingActivity.this.Q(this.a);
            }
        }

        public class b implements View.OnClickListener {
            public final /* synthetic */ long a;

            public b(long j) {
                this.a = j;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditTrainingActivity.this.C(this.a);
            }
        }

        public class c extends RecyclerView.ViewHolder {
            public RecyclerView a;
            public TextView b;
            public View c;
            public View d;
            public TextView e;
            public TextView f;

            public c(View view) {
                super(view);
                this.a = (RecyclerView) view.findViewById(R.id.info_area);
                this.b = (TextView) view.findViewById(R.id.repeat_count);
                this.e = (TextView) view.findViewById(R.id.edit_repeat_count);
                this.f = (TextView) view.findViewById(R.id.disband_repeat);
                this.c = view.findViewById(R.id.repeat_info_area);
                this.d = view.findViewById(R.id.horizontal_line);
                this.a.setLayoutManager(new LinearLayoutManager(EditTrainingActivity.this.getApplicationContext()));
            }
        }

        public v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i) {
            IntervalGroupInfo intervalGroupInfo = EditTrainingActivity.this.k.getGroupList().get(i);
            int repeatCount = intervalGroupInfo.getRepeatCount();
            boolean z = repeatCount > 0;
            long groupId = intervalGroupInfo.getGroupId();
            if (z) {
                cVar.c.setVisibility(0);
            } else {
                cVar.c.setVisibility(8);
            }
            cVar.b.setText("x" + repeatCount);
            if (EditTrainingActivity.this.n && z) {
                cVar.d.setVisibility(0);
                cVar.e.setVisibility(0);
                cVar.f.setVisibility(0);
                cVar.e.setOnClickListener(new a(groupId));
                cVar.f.setOnClickListener(new b(groupId));
            } else {
                cVar.d.setVisibility(8);
                cVar.e.setVisibility(8);
                cVar.f.setVisibility(8);
            }
            w wVar = EditTrainingActivity.this.new w(intervalGroupInfo.getGroupId());
            cVar.a.setAdapter(wVar);
            wVar.a().attachToRecyclerView(cVar.a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new c(LayoutInflater.from(EditTrainingActivity.this.getApplicationContext()).inflate(R.layout.list_item_training_group_info, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return EditTrainingActivity.this.k.getGroupList().size();
        }
    }

    public class w extends RecyclerView.Adapter<c> {
        public long a;
        public ItemTouchHelper b;

        public class a extends ItemTouchHelper.Callback {
            public final /* synthetic */ EditTrainingActivity a;
            public final /* synthetic */ List b;

            public a(EditTrainingActivity editTrainingActivity, List list) {
                this.a = editTrainingActivity;
                this.b = list;
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
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                Collections.swap(this.b, adapterPosition, adapterPosition2);
                w.this.notifyItemMoved(adapterPosition, adapterPosition2);
                return true;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                super.onSelectedChanged(viewHolder, i);
                if (viewHolder == null) {
                    w.this.notifyDataSetChanged();
                }
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            }
        }

        public class b implements View.OnLongClickListener {
            public final /* synthetic */ c a;

            public b(c cVar) {
                this.a = cVar;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (w.this.getA() <= 1) {
                    return false;
                }
                w.this.b.startDrag(this.a);
                return true;
            }
        }

        public class c extends RecyclerView.ViewHolder {
            public ImageView a;
            public ImageView b;
            public TextView c;
            public TextView d;
            public TextView e;
            public TextView f;
            public TextView g;
            public CheckBox h;
            public View i;
            public View j;

            public class a implements CompoundButton.OnCheckedChangeListener {
                public final /* synthetic */ IntervalItemInfo a;

                public a(IntervalItemInfo intervalItemInfo) {
                    this.a = intervalItemInfo;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        EditTrainingActivity.this.p.put(Long.valueOf(this.a.getGroupId()), this.a);
                    } else if (EditTrainingActivity.this.p.containsKey(Long.valueOf(this.a.getGroupId()))) {
                        EditTrainingActivity.this.p.remove(Long.valueOf(this.a.getGroupId()));
                    }
                    if (EditTrainingActivity.this.p == null || EditTrainingActivity.this.p.size() <= 0) {
                        EditTrainingActivity.this.f.setEnabled(false);
                    } else {
                        EditTrainingActivity.this.f.setEnabled(true);
                    }
                }
            }

            public class b implements View.OnClickListener {
                public final /* synthetic */ int a;

                public b(int i) {
                    this.a = i;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EditTrainingActivity.this.j.setCursorVisible(false);
                    w wVar = w.this;
                    IntervalGroupInfo intervalGroupInfoH = EditTrainingActivity.this.H(wVar.a);
                    if (intervalGroupInfoH != null) {
                        List<IntervalItemInfo> itemInfoList = intervalGroupInfoH.getItemInfoList();
                        if (itemInfoList != null) {
                            itemInfoList.remove(this.a);
                            if (itemInfoList.isEmpty()) {
                                EditTrainingActivity.this.k.getGroupList().remove(intervalGroupInfoH);
                            }
                        }
                        EditTrainingActivity.this.c.notifyDataSetChanged();
                    }
                    EditTrainingActivity.this.d.setEnabled(EditTrainingActivity.this.B());
                    EditTrainingActivity.this.U();
                }
            }

            /* JADX INFO: renamed from: com.huami.watch.companion.intervalrun.ui.EditTrainingActivity$w$c$c, reason: collision with other inner class name */
            public class ViewOnClickListenerC0656c implements View.OnClickListener {
                public final /* synthetic */ int a;

                public ViewOnClickListenerC0656c(int i) {
                    this.a = i;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (EditTrainingActivity.this.n) {
                        return;
                    }
                    EditTrainingActivity.this.j.setCursorVisible(false);
                    w wVar = w.this;
                    EditTrainingActivity.this.M(wVar.a, this.a);
                }
            }

            public class d implements View.OnClickListener {
                public final /* synthetic */ int a;

                public d(int i) {
                    this.a = i;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (EditTrainingActivity.this.n) {
                        return;
                    }
                    EditTrainingActivity.this.j.setCursorVisible(false);
                    w wVar = w.this;
                    EditTrainingActivity.this.P(wVar.a, this.a);
                }
            }

            public c(View view) {
                super(view);
                this.a = (ImageView) view.findViewById(R.id.delete_icon);
                this.b = (ImageView) view.findViewById(R.id.sort_flag);
                this.c = (TextView) view.findViewById(R.id.duration_title);
                this.d = (TextView) view.findViewById(R.id.duration_setting);
                this.e = (TextView) view.findViewById(R.id.reminder_title);
                this.f = (TextView) view.findViewById(R.id.reminder_setting);
                this.h = (CheckBox) view.findViewById(R.id.checkbox);
                this.g = (TextView) view.findViewById(R.id.type_setting);
                this.i = view.findViewById(R.id.line);
                this.j = view.findViewById(R.id.item_root_view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void b(int i, View view) {
                if (EditTrainingActivity.this.n) {
                    return;
                }
                w wVar = w.this;
                EditTrainingActivity.this.T(wVar.a, i);
            }

            public void c(IntervalItemInfo intervalItemInfo, final int i, boolean z) {
                EditTrainingActivity editTrainingActivity;
                int i2;
                long j;
                long j2;
                if (EditTrainingActivity.this.n) {
                    this.g.setEnabled(false);
                    this.d.setEnabled(false);
                    this.f.setEnabled(false);
                    this.b.setVisibility(0);
                    if (z) {
                        this.h.setVisibility(8);
                    } else {
                        this.h.setVisibility(0);
                        this.h.setOnCheckedChangeListener(new a(intervalItemInfo));
                    }
                } else {
                    this.g.setEnabled(true);
                    this.d.setEnabled(true);
                    this.a.setVisibility(0);
                    this.a.setOnClickListener(new b(i));
                }
                this.i.setVisibility(z ? 0 : 8);
                if (intervalItemInfo.getType() == 0 || !EditTrainingActivity.this.s) {
                    if (!EditTrainingActivity.this.n) {
                        this.f.setEnabled(true);
                    }
                    this.g.setText(R.string.training_type_exercise);
                } else if (intervalItemInfo.getType() == 1) {
                    this.f.setEnabled(false);
                    this.g.setText(R.string.training_type_rest);
                } else {
                    this.f.setEnabled(false);
                    this.g.setText(R.string.training_click_setting);
                }
                int lengthType = intervalItemInfo.getLengthType();
                int lengthValue = intervalItemInfo.getLengthValue();
                if (lengthType == 0) {
                    if (EditTrainingActivity.this.q) {
                        editTrainingActivity = EditTrainingActivity.this;
                        i2 = R.string.unit_kilometer;
                    } else {
                        editTrainingActivity = EditTrainingActivity.this;
                        i2 = R.string.unit_mile_space;
                    }
                    String string = editTrainingActivity.getString(i2);
                    this.d.setText(SportFormatUtils.formatDistance(lengthValue, !EditTrainingActivity.this.q, 4) + string);
                } else if (lengthType == 1) {
                    this.d.setText(SportFormatUtils.formatTimeInSportForm(lengthValue));
                } else if (lengthType != 2) {
                    this.d.setText(R.string.training_click_setting);
                } else {
                    this.d.setText(R.string.training_menu_click);
                }
                double[] reminderValue = intervalItemInfo.getReminderValue();
                int reminderType = intervalItemInfo.getReminderType();
                if (reminderType == 3) {
                    this.e.setText(R.string.training_pace_title);
                    if (EditTrainingActivity.this.q) {
                        j2 = (long) (reminderValue[0] * 1000.0d);
                        j = (long) (reminderValue[1] * 1000.0d);
                    } else {
                        long j3 = (long) NumberFormatter.format((reminderValue[0] * 1000.0d) / 1.6093440055847168d, 0, 4);
                        j = (long) NumberFormatter.format((reminderValue[1] * 1000.0d) / 1.6093440055847168d, 0, 4);
                        j2 = j3;
                    }
                    if (reminderValue != null) {
                        this.f.setText(SportFormatUtils.formatTimeInSportForm(j2) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + SportFormatUtils.formatTimeInSportForm(j));
                    }
                } else if (reminderType == 4) {
                    this.e.setText(R.string.training_hr_title);
                    if (reminderValue != null) {
                        int i3 = (int) reminderValue[0];
                        if (i3 == 0) {
                            this.f.setText(R.string.heart_section4);
                        } else if (i3 == 1) {
                            this.f.setText(R.string.heart_section3);
                        } else if (i3 == 2) {
                            this.f.setText(R.string.heart_section2);
                        } else if (i3 == 3) {
                            this.f.setText(R.string.heart_section1);
                        } else if (i3 != 4) {
                            this.f.setText(((int) reminderValue[0]) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ((int) reminderValue[1]) + EditTrainingActivity.this.getString(R.string.hr_unit_name_space));
                        } else {
                            this.f.setText(R.string.heart_section0);
                        }
                    } else {
                        this.f.setText(R.string.training_click_setting);
                    }
                } else if (reminderType != 5) {
                    this.e.setText(R.string.sport_training_reminder);
                    this.f.setText(R.string.training_click_setting);
                } else {
                    this.e.setText(R.string.sport_training_reminder);
                    this.f.setText(R.string.training_menu_reminder_empty);
                }
                this.d.setOnClickListener(new ViewOnClickListenerC0656c(i));
                this.f.setOnClickListener(new d(i));
                this.g.setOnClickListener(new View.OnClickListener() { // from class: com.huami.watch.companion.intervalrun.ui.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.b(i, view);
                    }
                });
            }
        }

        public w(long j) {
            this.a = j;
            this.b = new ItemTouchHelper(new a(EditTrainingActivity.this, EditTrainingActivity.this.H(j).getItemInfoList()));
        }

        public ItemTouchHelper a() {
            return this.b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i) {
            IntervalGroupInfo intervalGroupInfoH = EditTrainingActivity.this.H(this.a);
            if (intervalGroupInfoH == null || intervalGroupInfoH.getItemInfoList() == null) {
                return;
            }
            List<IntervalItemInfo> itemInfoList = intervalGroupInfoH.getItemInfoList();
            boolean z = intervalGroupInfoH.getRepeatCount() > 0;
            IntervalItemInfo intervalItemInfo = itemInfoList.get(i);
            if (this.b != null) {
                cVar.j.setOnLongClickListener(new b(cVar));
            }
            cVar.c(intervalItemInfo, i, z);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new c(LayoutInflater.from(EditTrainingActivity.this.getApplicationContext()).inflate(EditTrainingActivity.this.n ? R.layout.list_item_training_info_edit : R.layout.list_item_training_info, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            IntervalGroupInfo intervalGroupInfoH;
            if (EditTrainingActivity.this.k.getGroupList() == null || (intervalGroupInfoH = EditTrainingActivity.this.H(this.a)) == null || intervalGroupInfoH.getItemInfoList() == null) {
                return 0;
            }
            return intervalGroupInfoH.getItemInfoList().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        List<IntervalGroupInfo> groupList;
        IntervalTrainingInfo intervalTrainingInfo = this.k;
        return (intervalTrainingInfo == null || (groupList = intervalTrainingInfo.getGroupList()) == null || groupList.size() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(long j2) {
        IntervalGroupInfo intervalGroupInfoH = H(j2);
        int iG = G(j2);
        intervalGroupInfoH.setRepeatCount(0);
        List<IntervalItemInfo> itemInfoList = intervalGroupInfoH.getItemInfoList();
        if (itemInfoList != null) {
            int size = itemInfoList.size();
            List<IntervalGroupInfo> groupList = this.k.getGroupList();
            int size2 = groupList.size();
            if (size2 > 0) {
                j2 = groupList.get(size2 - 1).getGroupId() + 1;
            }
            groupList.remove(intervalGroupInfoH);
            for (int i2 = 0; i2 < size; i2++) {
                IntervalGroupInfo intervalGroupInfo = new IntervalGroupInfo();
                intervalGroupInfo.setGroupId(((long) i2) + j2);
                intervalGroupInfo.setRepeatCount(0);
                IntervalItemInfo intervalItemInfo = itemInfoList.get(i2);
                intervalItemInfo.setGroupId(intervalGroupInfo.getGroupId());
                ArrayList arrayList = new ArrayList();
                arrayList.add(intervalItemInfo);
                intervalGroupInfo.setItemInfoList(arrayList);
                groupList.add(iG, intervalGroupInfo);
                iG++;
            }
        }
        this.c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.n = true;
        this.l = this.k.copy();
        this.g.setVisibility(0);
        this.f.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.a.setTitleText(getString(R.string.training_setting_repeat));
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setText(R.string.repeat_done);
        this.h.setEnabled(true);
        this.p = new LinkedHashMap();
        this.f.setEnabled(false);
        this.c.notifyDataSetChanged();
    }

    private void E(boolean z2) {
        this.n = false;
        if (z2) {
            this.k = this.l;
        }
        this.l = null;
        this.a.setTitleText(getString(R.string.custom_interval_training));
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.i.setVisibility(0);
        this.j.setVisibility(0);
        this.h.setText(R.string.save_training);
        U();
        this.p = null;
        this.c.notifyDataSetChanged();
    }

    private List<IntervalTrainingInfo> F() {
        String str = UserSettings.get(getContentResolver(), UserSettingsKeys.KEY_INTERVAL_RUN);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (List) new Gson().fromJson(str, new k().getType());
        } catch (Exception e2) {
            Log.d(B, "parse training info error:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G(long j2) {
        List<IntervalGroupInfo> groupList = this.k.getGroupList();
        int size = groupList != null ? groupList.size() : 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (groupList.get(i2).getGroupId() == j2) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IntervalGroupInfo H(long j2) {
        List<IntervalGroupInfo> groupList = this.k.getGroupList();
        int size = groupList != null ? groupList.size() : 0;
        for (int i2 = 0; i2 < size; i2++) {
            IntervalGroupInfo intervalGroupInfo = groupList.get(i2);
            if (intervalGroupInfo.getGroupId() == j2) {
                return intervalGroupInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String I(int i2, double[] dArr) {
        if (i2 == 0) {
            if (dArr == null) {
                dArr = this.q ? new double[]{0.0d, 100.0d} : new double[]{0.0d, 160.0d};
            }
            return getString(R.string.training_mileage_value_title, new Object[]{SportFormatUtils.formatDistance(dArr[1], !this.q, 4), getString(this.q ? R.string.unit_km : R.string.unit_mile)});
        }
        if (i2 == 1) {
            if (dArr == null) {
                dArr = new double[]{0.0d, 1.0d};
            }
            return getString(R.string.training_time_value_title, new Object[]{SportFormatUtils.formatTimeInSportForm((long) dArr[1])});
        }
        if (i2 == 2) {
            if (dArr == null) {
                dArr = new double[]{120.0d, 120.0d};
            }
            long j2 = (long) dArr[0];
            long j3 = (long) dArr[1];
            return getString(R.string.training_pace_value_title, new Object[]{SportFormatUtils.formatTimeInSportForm(j2) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + SportFormatUtils.formatTimeInSportForm(j3)});
        }
        if (i2 != 3) {
            return "";
        }
        if (dArr == null) {
            dArr = new double[]{92.0d, 92.0d};
        }
        return getString(R.string.training_pace_value_title, new Object[]{((int) dArr[0]) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ((int) dArr[1]) + getString(R.string.hr_unit_name)});
    }

    private boolean J() {
        this.k.setTitle(this.j.getText().toString().trim());
        return !new Gson().toJson(this.k).equalsIgnoreCase(this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(IntervalItemInfo intervalItemInfo, MenuFragment menuFragment, int i2) {
        if (i2 == 0) {
            intervalItemInfo.setType(i2);
        } else {
            intervalItemInfo.setType(1);
            if (intervalItemInfo.getLengthType() == 0) {
                intervalItemInfo.setLengthType(-1);
            }
            intervalItemInfo.setReminderType(5);
        }
        U();
        this.c.notifyDataSetChanged();
        menuFragment.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.n) {
            E(false);
            return;
        }
        if (TextUtils.isEmpty(this.j.getText().toString().trim())) {
            S(getString(R.string.training_title_not_empty_tips));
            return;
        }
        if (this.c.getA() <= 0 || !this.k.isValid()) {
            S(getString(R.string.training_item_not_empty_tips));
            return;
        }
        if (!J()) {
            finish();
        }
        List<IntervalTrainingInfo> listF = F();
        if (listF != null) {
            int i2 = this.m;
            if (i2 != -1) {
                listF.set(i2, this.k);
            } else {
                listF.add(this.k);
            }
        } else {
            listF = new ArrayList<>();
            listF.add(this.k);
        }
        String json = new Gson().toJson(listF);
        UserSettings.put(getContentResolver(), UserSettingsKeys.KEY_INTERVAL_RUN, json);
        SyncUtil.syncIntervalRunToWatch(getApplicationContext(), json);
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j2, int i2) {
        IntervalItemInfo intervalItemInfo = H(j2).getItemInfoList().get(i2);
        int lengthType = intervalItemInfo.getLengthType();
        ArrayList arrayList = new ArrayList();
        if (intervalItemInfo.getType() == 1 && this.s) {
            lengthType = 0;
        } else {
            arrayList.add(new MenuFragment.MenuInfo(0, R.string.training_menu_mileage));
        }
        arrayList.add(new MenuFragment.MenuInfo(1, R.string.training_menu_time));
        if (this.r) {
            arrayList.add(new MenuFragment.MenuInfo(2, R.string.training_menu_click));
        }
        MenuFragment menuFragmentNewInstance = MenuFragment.newInstance(1, lengthType, true);
        menuFragmentNewInstance.setMenuInfoList(arrayList);
        menuFragmentNewInstance.setMenuClickListener(new d(j2, i2, intervalItemInfo, menuFragmentNewInstance));
        menuFragmentNewInstance.show(getSupportFragmentManager(), "menu_duration");
    }

    private void N() {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(7);
        alertDialogFragmentNewInstance.setMessage(getString(R.string.exit_training_setting_tips));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.confirm_exit_training_setting), new b());
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new c(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(getFragmentManager(), "exit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, int i2, long j2, int i3) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(5);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        TrainingPickerFragment trainingPickerFragment = new TrainingPickerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        trainingPickerFragment.setArguments(bundle);
        trainingPickerFragment.setOnWheelChangedListener(new i(alertDialogFragmentNewInstance, str, i2, trainingPickerFragment));
        alertDialogFragmentNewInstance.setContent(trainingPickerFragment);
        alertDialogFragmentNewInstance.setTitle(str + "\n" + I(i2, null));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_enter), new j(trainingPickerFragment, j2, i3, i2, alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new l(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(fragmentTransactionBeginTransaction, "picker");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(long j2, int i2) {
        IntervalItemInfo intervalItemInfo = H(j2).getItemInfoList().get(i2);
        MenuFragment menuFragmentNewInstance = MenuFragment.newInstance(1, intervalItemInfo.getReminderType() - 3, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MenuFragment.MenuInfo(0, R.string.training_menu_reminder_pace));
        arrayList.add(new MenuFragment.MenuInfo(1, R.string.training_menu_reminder_hr));
        arrayList.add(new MenuFragment.MenuInfo(2, R.string.training_menu_reminder_empty));
        menuFragmentNewInstance.setMenuInfoList(arrayList);
        menuFragmentNewInstance.setMenuClickListener(new e(j2, i2, intervalItemInfo, menuFragmentNewInstance));
        menuFragmentNewInstance.show(getSupportFragmentManager(), "menu_reminder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(long j2) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(5);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        String string = getString(R.string.training_repeat_picker_title);
        TrainingPickerFragment trainingPickerFragment = new TrainingPickerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", 4);
        trainingPickerFragment.setArguments(bundle);
        trainingPickerFragment.setOnWheelChangedListener(new f(trainingPickerFragment, alertDialogFragmentNewInstance, string));
        alertDialogFragmentNewInstance.setContent(trainingPickerFragment);
        alertDialogFragmentNewInstance.setTitle(string + "\n" + getString(R.string.training_repeat_value_title, new Object[]{"1"}));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_enter), new g(alertDialogFragmentNewInstance, trainingPickerFragment, j2));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new h(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(fragmentTransactionBeginTransaction, "repeat_picker");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(long j2, int i2) {
        int i3;
        IntervalItemInfo intervalItemInfo = H(j2).getItemInfoList().get(i2);
        if (intervalItemInfo.getReminderType() == 4) {
            i3 = (int) intervalItemInfo.getReminderValue()[0];
            if (i3 > 5) {
                i3 = 5;
            }
        } else {
            i3 = -1;
        }
        MenuFragment menuFragmentNewInstance = MenuFragment.newInstance(1, i3, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MenuFragment.MenuInfo(0, R.string.heart_section4));
        arrayList.add(new MenuFragment.MenuInfo(1, R.string.heart_section3));
        arrayList.add(new MenuFragment.MenuInfo(2, R.string.heart_section2));
        arrayList.add(new MenuFragment.MenuInfo(3, R.string.heart_section1));
        arrayList.add(new MenuFragment.MenuInfo(4, R.string.heart_section0));
        arrayList.add(new MenuFragment.MenuInfo(5, R.string.custom));
        menuFragmentNewInstance.setMenuInfoList(arrayList);
        menuFragmentNewInstance.setMenuClickListener(new m(j2, i2, intervalItemInfo, menuFragmentNewInstance));
        menuFragmentNewInstance.show(getSupportFragmentManager(), "hr_menu");
    }

    private void S(String str) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(6);
        alertDialogFragmentNewInstance.setMessage(str);
        alertDialogFragmentNewInstance.setNeutral(getString(R.string.dialog_confirm), new a(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(getFragmentManager(), "tips");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(long j2, int i2) {
        final IntervalItemInfo intervalItemInfo = H(j2).getItemInfoList().get(i2);
        int type = intervalItemInfo.getType();
        if (!this.s) {
            type = 0;
        }
        final MenuFragment menuFragmentNewInstance = MenuFragment.newInstance(1, type, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MenuFragment.MenuInfo(0, R.string.training_type_exercise));
        if (this.s) {
            arrayList.add(new MenuFragment.MenuInfo(1, R.string.training_type_rest));
        }
        menuFragmentNewInstance.setMenuInfoList(arrayList);
        menuFragmentNewInstance.setMenuClickListener(new MenuFragment.MenuClickListener() { // from class: pj1
            @Override // com.huami.watch.companion.sport.ui.fragment.MenuFragment.MenuClickListener
            public final void onClickMenu(int i3) {
                this.a.K(intervalItemInfo, menuFragmentNewInstance, i3);
            }
        });
        menuFragmentNewInstance.show(getSupportFragmentManager(), "menu_type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.n) {
            this.h.setEnabled(true);
        } else if (!this.k.isValid() || TextUtils.isEmpty(this.j.getText())) {
            this.h.setEnabled(false);
        } else {
            this.h.setEnabled(true);
        }
    }

    private void initData() {
        List<IntervalTrainingInfo> listF;
        this.q = UnitManager.isDistanceKM(this);
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        this.r = DeviceSource.isSeriesEverest(currentDevice);
        this.s = DeviceUtil.isRomSupportIntervalRest(currentDevice);
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("index", -1);
            this.m = intExtra;
            if (intExtra != -1 && (listF = F()) != null) {
                int size = listF.size();
                int i2 = this.m;
                if (i2 < size) {
                    this.k = listF.get(i2);
                }
            }
        }
        if (this.k == null) {
            IntervalItemInfo intervalItemInfo = new IntervalItemInfo();
            if (!this.s) {
                intervalItemInfo.setType(0);
            }
            intervalItemInfo.setGroupId(System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            arrayList.add(intervalItemInfo);
            IntervalGroupInfo intervalGroupInfo = new IntervalGroupInfo();
            intervalGroupInfo.setGroupId(intervalItemInfo.getGroupId());
            intervalGroupInfo.setItemInfoList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(intervalGroupInfo);
            IntervalTrainingInfo intervalTrainingInfo = new IntervalTrainingInfo();
            this.k = intervalTrainingInfo;
            intervalTrainingInfo.setTitle("");
            this.k.setGroupList(arrayList2);
        }
        this.o = new Gson().toJson(this.k);
    }

    private void initView() {
        this.h = (TextView) findViewById(R.id.save_text);
        this.i = (TextView) findViewById(R.id.training_title);
        this.f = (TextView) findViewById(R.id.repeat_count_setting);
        this.j = (EditText) findViewById(R.id.title_edit);
        this.d = (TextView) findViewById(R.id.repeat);
        this.g = (TextView) findViewById(R.id.select_repeat_title);
        this.e = (TextView) findViewById(R.id.intermittent);
        this.b = (RecyclerView) findViewById(R.id.recycler_view);
        this.j.setCursorVisible(false);
        this.j.setOnTouchListener(new n());
        this.d.setEnabled(B());
        IntervalTrainingInfo intervalTrainingInfo = this.k;
        if (intervalTrainingInfo != null) {
            String title = intervalTrainingInfo.getTitle();
            if (!TextUtils.isEmpty(title)) {
                this.j.setText(this.k.getTitle());
                this.j.setSelection(title.length());
            }
        }
        this.j.addTextChangedListener(new o());
        this.h.setOnClickListener(new p());
        U();
        this.f.setOnClickListener(new q());
        this.b.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        v vVar = new v();
        this.c = vVar;
        this.b.setAdapter(vVar);
        new ItemTouchHelper(new r()).attachToRecyclerView(this.b);
        this.d.setOnClickListener(new s());
        this.e.setOnClickListener(new t());
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        this.a = actionbarLayout;
        actionbarLayout.setTitleText(getString(R.string.custom_interval_training));
        this.a.setBackArrowClickListener(new u());
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.n) {
            E(true);
        } else if (J()) {
            N();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_edit_training);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        initData();
        initView();
    }
}
