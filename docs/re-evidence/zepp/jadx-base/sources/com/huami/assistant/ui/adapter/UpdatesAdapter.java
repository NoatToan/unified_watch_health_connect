package com.huami.assistant.ui.adapter;

import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.util.MultiTypeDelegate;
import com.daimajia.swipe.SwipeLayout;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.R;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.model.bean.UpdateType;
import com.huami.assistant.sms.parse.bean.CinemaTicket;
import com.huami.assistant.sms.parse.bean.Didi;
import com.huami.assistant.sms.parse.bean.Flight;
import com.huami.assistant.sms.parse.bean.TrainInfo;
import com.huami.assistant.ui.adapter.UpdatesAdapter;
import com.huami.assistant.ui.widget.DateInfoView;
import com.huami.assistant.ui.widget.ExpandTextView;
import com.huami.assistant.util.AlarmUtil;
import com.huami.assistant.util.PinUtil;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.util.TimeUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class UpdatesAdapter extends BaseRecyclerSwipeAdapter<Object, BaseViewHolder> {
    public static final int TYPE_EMPTY = 10002;
    public static final int TYPE_TITLE = 10001;

    public class a extends MultiTypeDelegate<Object> {
        public a() {
        }

        @Override // com.chad.library.adapter.base.util.MultiTypeDelegate
        public int getItemType(Object obj) {
            if (obj instanceof Long) {
                return 10001;
            }
            if (obj instanceof Update) {
                return ((Update) obj).type;
            }
            return 10002;
        }
    }

    public UpdatesAdapter() {
        super(null);
        setMultiTypeDelegate(k());
    }

    private void d(BaseViewHolder helper, @NonNull Alarm alarm) {
        p(helper, AlarmUtil.getAlarmTime(alarm.hour, alarm.minutes));
        q(helper, UpdateType.ALARM, AlarmUtil.getAlarmRepeatString(this.mContext, alarm.days));
    }

    private void e(BaseViewHolder helper, @NonNull CinemaTicket cinemaTicket) {
        p(helper, TimeUtil.formatDateTime(cinemaTicket.startTime, "HH:mm"));
        q(helper, UpdateType.CINEMA_TICKET, cinemaTicket.movieName);
        helper.setText(R.id.card_cinema_code, cinemaTicket.checkCode);
        n(helper, new ExpandTextView[0]);
    }

    private void f(BaseViewHolder helper, Update update) {
        p(helper, TimeUtil.formatDateTime(update.startTime, "HH:mm"));
        q(helper, UpdateType.DIDI, "");
        Didi didi = UpdateParser.toDidi(update.data);
        if (didi != null) {
            helper.setText(R.id.card_didi_car_info, didi.plateNum);
            helper.setText(R.id.card_didi_detail, didi.content.trim());
        }
        n(helper, (ExpandTextView) helper.getView(R.id.card_didi_detail));
    }

    private void g(BaseViewHolder helper, Update update) {
        String dateTime = TimeUtil.formatDateTime(update.startTime, "HH:mm");
        p(helper, dateTime);
        q(helper, UpdateType.FLIGHT, "");
        Flight flight = UpdateParser.toFlight(update.data);
        if (flight != null) {
            helper.setText(R.id.card_takeoff_time, dateTime);
            helper.setText(R.id.card_flight_num, flight.fightNumber);
            helper.setText(R.id.card_takeoff_airport, flight.takeoffAirport);
            helper.setText(R.id.card_arrive_airport, flight.arriveAirport);
            helper.setText(R.id.card_flight_detail, flight.content.trim());
        }
        n(helper, (ExpandTextView) helper.getView(R.id.card_flight_detail));
    }

    private void h(BaseViewHolder helper, Event event) {
        q(helper, UpdateType.EVENT, "");
        p(helper, event.allDay ? this.mContext.getString(R.string.all_day_event) : l(event.startMillis, event.endMillis));
        if (TextUtils.isEmpty(event.description)) {
            helper.getView(R.id.card_reminder_desc_content).setVisibility(8);
        } else {
            helper.getView(R.id.card_reminder_desc_content).setVisibility(0);
            helper.setText(R.id.card_reminder_desc, event.description.trim());
        }
        int i = R.id.card_reminder_title;
        helper.setText(i, TextUtils.isEmpty(event.title) ? this.mContext.getString(R.string.info_empty) : event.title.trim());
        n(helper, (ExpandTextView) helper.getView(i), (ExpandTextView) helper.getView(R.id.card_reminder_desc));
    }

    private void i(BaseViewHolder helper, Long item) {
        ((DateInfoView) helper.getView(R.id.tv_update_date)).setTime(item.longValue());
    }

    private void j(BaseViewHolder helper, Update update) {
        p(helper, TimeUtil.formatDateTime(update.startTime, "HH:mm"));
        q(helper, UpdateType.TRAIN, "");
        TrainInfo trainInfo = UpdateParser.toTrainInfo(update.data);
        if (trainInfo != null) {
            helper.setText(R.id.card_train_number, trainInfo.number);
            helper.setText(R.id.card_train_seat, trainInfo.seat);
            helper.setText(R.id.card_train_starting_station, trainInfo.startingStation);
            helper.setText(R.id.card_train_ticket_entrance, trainInfo.ticketEntrance);
            helper.setText(R.id.card_train_detail, trainInfo.content.trim());
        }
        n(helper, (ExpandTextView) helper.getView(R.id.card_train_detail));
    }

    private MultiTypeDelegate<Object> k() {
        a aVar = new a();
        aVar.registerItemType(10002, R.layout.view_no_update);
        aVar.registerItemType(10001, R.layout.card_item_date);
        UpdateType updateType = UpdateType.EVENT;
        aVar.registerItemType(updateType.typeId, updateType.layoutResId);
        UpdateType updateType2 = UpdateType.ALARM;
        aVar.registerItemType(updateType2.typeId, updateType2.layoutResId);
        UpdateType updateType3 = UpdateType.CINEMA_TICKET;
        aVar.registerItemType(updateType3.typeId, updateType3.layoutResId);
        UpdateType updateType4 = UpdateType.DIDI;
        aVar.registerItemType(updateType4.typeId, updateType4.layoutResId);
        UpdateType updateType5 = UpdateType.TRAIN;
        aVar.registerItemType(updateType5.typeId, updateType5.layoutResId);
        UpdateType updateType6 = UpdateType.FLIGHT;
        aVar.registerItemType(updateType6.typeId, updateType6.layoutResId);
        return aVar;
    }

    private String l(long startTime, long endTime) {
        return DateUtils.formatDateRange(this.mContext, startTime, endTime, 655489);
    }

    private void m(BaseViewHolder helper) {
        View view = helper.getView(R.id.card_item_divider);
        if (view != null) {
            if (getItemViewType(helper.getAdapterPosition() + 1) == 10001) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    private void n(BaseViewHolder helper, final ExpandTextView... textViews) {
        final TextView textView = (TextView) helper.getView(R.id.card_item_expand);
        if (textView == null) {
            return;
        }
        if (textViews == null || textViews.length == 0) {
            textView.setVisibility(8);
            return;
        }
        final HashMap map = new HashMap(32);
        for (final ExpandTextView expandTextView : textViews) {
            expandTextView.setOnNeedExpandChangeListener(new ExpandTextView.OnNeedExpandChangeListener() { // from class: r38
                @Override // com.huami.assistant.ui.widget.ExpandTextView.OnNeedExpandChangeListener
                public final void onNeedExpandChange(boolean z) {
                    this.a.t(map, expandTextView, textView, z);
                }
            });
            expandTextView.setOnExpandStateChangeListener(new ExpandTextView.OnExpandStateChangeListener() { // from class: q38
                @Override // com.huami.assistant.ui.widget.ExpandTextView.OnExpandStateChangeListener
                public final void onExpandStateChanged(ExpandTextView expandTextView2, boolean z) {
                    UpdatesAdapter.u(textView, expandTextView2, z);
                }
            });
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: p38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdatesAdapter.v(textViews, view);
            }
        });
    }

    private void o(@NonNull Map<String, Boolean> expandMap, @NonNull View expandView) {
        boolean z;
        Iterator<Map.Entry<String, Boolean>> it2 = expandMap.entrySet().iterator();
        loop0: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                } else {
                    z = z || it2.next().getValue().booleanValue();
                }
            }
        }
        expandView.setVisibility(z ? 0 : 8);
    }

    private void p(BaseViewHolder helper, String time) {
        helper.setText(R.id.card_item_time, time);
    }

    private void q(BaseViewHolder helper, UpdateType type, String extra) {
        helper.setImageResource(R.id.card_item_icon, type.iconResId);
        helper.setText(R.id.card_item_title, type.nameResId);
        helper.setText(R.id.card_item_sub_title, extra);
    }

    private void r(BaseViewHolder helper, Object item) {
        int i = R.id.iv_fixed;
        if (((ImageView) helper.getView(i)) == null || !(item instanceof Update)) {
            return;
        }
        helper.setVisible(i, w(helper.getItemViewType()));
        helper.setImageResource(i, PinUtil.isUpdateHasPin((Update) item) ? R.drawable.ic_lock_p : R.drawable.ic_lock_n);
        helper.addOnClickListener(i);
    }

    private void s(BaseViewHolder helper, Object item) {
        SwipeLayout swipeLayout = (SwipeLayout) helper.getView(R.id.swipe);
        if (swipeLayout != null) {
            swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);
            int i = R.id.tv_edit;
            helper.setVisible(i, x(helper.getItemViewType()));
            this.mItemManger.bindView(helper.itemView, helper.getAdapterPosition());
            helper.addOnClickListener(R.id.tv_delete);
            helper.addOnClickListener(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Map map, ExpandTextView expandTextView, TextView textView, boolean z) {
        map.put(expandTextView.getText().toString(), Boolean.valueOf(z));
        o(map, textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(TextView textView, ExpandTextView expandTextView, boolean z) {
        if (expandTextView.isNeedCollapse()) {
            textView.setText(z ? R.string.un_expand : R.string.expand);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(ExpandTextView[] expandTextViewArr, View view) {
        for (ExpandTextView expandTextView : expandTextViewArr) {
            expandTextView.setCollapsed(!expandTextView.isCollapsed());
        }
    }

    private boolean w(int type) {
        return type != 1 && AssistantModule.isSupportPin(this.mContext);
    }

    private boolean x(int type) {
        return type == 1 || type == 2;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder helper, Object item) {
        int itemViewType = helper.getItemViewType();
        if (itemViewType == 1) {
            Alarm alarm = UpdateParser.toAlarm(((Update) item).data);
            if (alarm != null) {
                d(helper, alarm);
            }
        } else if (itemViewType == 2) {
            Event event = UpdateParser.toEvent(((Update) item).data);
            if (event != null) {
                h(helper, event);
            }
        } else if (itemViewType != 10001) {
            switch (itemViewType) {
                case 301:
                    CinemaTicket cinemaTicket = UpdateParser.toCinemaTicket(((Update) item).data);
                    if (cinemaTicket != null) {
                        e(helper, cinemaTicket);
                    }
                    break;
                case 302:
                    f(helper, (Update) item);
                    break;
                case 303:
                    j(helper, (Update) item);
                    break;
                case 304:
                    g(helper, (Update) item);
                    break;
            }
        } else {
            i(helper, (Long) item);
        }
        s(helper, item);
        r(helper, item);
        m(helper);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeAdapterInterface
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }
}
