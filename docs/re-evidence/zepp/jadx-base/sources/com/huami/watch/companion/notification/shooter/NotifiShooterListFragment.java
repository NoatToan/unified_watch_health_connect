package com.huami.watch.companion.notification.shooter;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class NotifiShooterListFragment extends Fragment {
    private static final String e = "NotifiShooterListFragment";
    private Transporter a;
    private RecyclerView b;
    private String[] c;
    private boolean d;

    public class a extends RecyclerView.ViewHolder {
        public TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.notification_type);
        }

        public void a(boolean z) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
            if (z) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) TypedValue.applyDimension(1, 52.0f, NotifiShooterListFragment.this.getResources().getDisplayMetrics());
                ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                this.itemView.setVisibility(0);
            } else {
                this.itemView.setVisibility(8);
                ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
            }
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    public class b extends RecyclerView.Adapter<a> {
        private final LayoutInflater a;

        public class a implements View.OnClickListener {
            public final /* synthetic */ NotifiShooter a;
            public final /* synthetic */ NotifiShooter.NotifiBullet b;

            public a(NotifiShooter notifiShooter, NotifiShooter.NotifiBullet notifiBullet) {
                this.a = notifiShooter;
                this.b = notifiBullet;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.a.shoot(this.b);
            }
        }

        public b(Context context) {
            this.a = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            Activity activity = NotifiShooterListFragment.this.getActivity();
            if (i == 0) {
                Log.v(NotifiShooterListFragment.e, "send low battery notification !", new Object[0]);
                NotificationTestManager.sendNotificationRequest(NotificationTestManager.NOTI_REQUEST_LOW_BATTERY, NotifiShooterListFragment.this.a);
                Analytics.event(activity, AnalyticsEvents.EVENT_LOW_POWER_NOTIFICATION_TEST);
                return;
            }
            if (i == 1) {
                Log.v(NotifiShooterListFragment.e, "send calling notification !", new Object[0]);
                NotificationTestManager.sendCallingNotification(NotifiShooterListFragment.this.getActivity());
                Analytics.event(activity, AnalyticsEvents.EVENT_CALL_NOTIFICATION_TEST);
            } else if (i == 2) {
                NotificationTestManager.sendNotificationRequest(NotificationTestManager.NOTI_REQUEST_SIT_TOO_LONG, NotifiShooterListFragment.this.a);
                Analytics.event(activity, AnalyticsEvents.EVENT_SEDENTARY_NOTIFICATION_TEST);
            } else if (i == 3) {
                NotificationTestManager.sendNotificationRequest(NotificationTestManager.NOTI_REQUEST_REACH_DAILY_GOAL, NotifiShooterListFragment.this.a);
                Analytics.event(activity, AnalyticsEvents.EVENT_ACTIVITY_UP_NOTIFICATION_TEST);
            } else {
                if (i != 4) {
                    return;
                }
                NotificationTestManager.sendNotificationRequest(NotificationTestManager.NOTI_REQUEST_WEATHER, NotifiShooterListFragment.this.a);
                Analytics.event(activity, AnalyticsEvents.EVENT_WEATHER_NOTIFICATION_TEST);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a aVar, final int i) {
            if (!NotifiShooterListFragment.this.d || i < NotifiShooterListFragment.this.c.length) {
                aVar.a.setText(NotifiShooterListFragment.this.c[i]);
                aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.watch.companion.notification.shooter.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.b(i, view);
                    }
                });
                return;
            }
            NotifiShooter shooter = NotifiShooter.getShooter(NotifiShooterListFragment.this.getActivity());
            NotifiShooter.NotifiBullet notifiBullet = NotifiShooter.sNotifiBullets[i - NotifiShooterListFragment.this.c.length];
            if (TextUtils.isEmpty(notifiBullet.d)) {
                aVar.a.setText(notifiBullet.c);
                aVar.itemView.setOnClickListener(new a(shooter, notifiBullet));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return NotifiShooterListFragment.this.new a(this.a.inflate(R.layout.layout_notifi_shooter_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getFragmentsCount() {
            return NotifiShooterListFragment.this.d ? NotifiShooterListFragment.this.c.length + NotifiShooter.sNotifiBullets.length : NotifiShooterListFragment.this.c.length;
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c = getResources().getStringArray(R.array.notification_test_items);
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.list);
        this.b = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.b.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.b.setAdapter(new b(getActivity()));
        this.b.addItemDecoration(new RecyclerViewDivider(this, getActivity(), 0, R.drawable.divider_settings_item));
        this.a = Transporter.get(getActivity(), "com.huami.watch.companion");
        this.d = Config.isTestMode();
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_notification_pushing_test_list, viewGroup, false);
    }

    public class RecyclerViewDivider extends RecyclerView.ItemDecoration {
        private Paint a;
        private Drawable b;
        private int c;
        private int d;
        private final int[] e;

        public RecyclerViewDivider(Context context, int i) {
            this.c = 1;
            int[] iArr = {android.R.attr.listDivider};
            this.e = iArr;
            if (i != 1 && i != 0) {
                throw new IllegalArgumentException("请输入正确的参数！");
            }
            this.d = i;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
            this.b = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
        }

        private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (i != childCount - 1) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                    int i2 = this.c + bottom;
                    Drawable drawable = this.b;
                    if (drawable != null) {
                        drawable.setBounds(paddingLeft, bottom, measuredWidth, i2);
                        this.b.draw(canvas);
                    }
                    Paint paint = this.a;
                    if (paint != null) {
                        canvas.drawRect(paddingLeft, bottom, measuredWidth, i2, paint);
                    }
                }
            }
        }

        private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
            int paddingTop = recyclerView.getPaddingTop();
            int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (i != childCount - 1) {
                    View childAt = recyclerView.getChildAt(i);
                    int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
                    int i2 = this.c + right;
                    Drawable drawable = this.b;
                    if (drawable != null) {
                        drawable.setBounds(right, paddingTop, i2, measuredHeight);
                        this.b.draw(canvas);
                    }
                    Paint paint = this.a;
                    if (paint != null) {
                        canvas.drawRect(right, paddingTop, i2, measuredHeight, paint);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.set(0, 0, 0, this.c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
            if (this.d == 1) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }

        public RecyclerViewDivider(NotifiShooterListFragment notifiShooterListFragment, Context context, int i, int i2) {
            this(context, i);
            Drawable drawable = ContextCompat.getDrawable(context, i2);
            this.b = drawable;
            this.c = drawable.getIntrinsicHeight();
        }

        public RecyclerViewDivider(NotifiShooterListFragment notifiShooterListFragment, Context context, int i, int i2, int i3) {
            this(context, i);
            this.c = i2;
            Paint paint = new Paint(1);
            this.a = paint;
            paint.setColor(i3);
            this.a.setStyle(Paint.Style.FILL);
        }
    }
}
