package com.xiaomi.fitness.devicesettings.common.contact;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.common.contact.ContactsListFragment$mHandler$1;
import com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/devicesettings/common/contact/ContactsListFragment$mHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactsListFragment$mHandler$1 extends Handler {
    final /* synthetic */ ContactsListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsListFragment$mHandler$1(ContactsListFragment contactsListFragment, Looper looper) {
        super(looper);
        this.this$0 = contactsListFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMessage$lambda$0(ContactsListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ContactsListAdapter contactsListAdapter = this$0.contactsListAdapter;
        if (contactsListAdapter != null) {
            contactsListAdapter.updateDataList(it);
        }
        return Unit.INSTANCE;
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 100) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Logger.d(WeatherSelectCityFragment.TAG, "weather: SelectCityFragment handleMessage:" + str);
            ContactsListViewModel contactsListViewModelAccess$getMViewModel = ContactsListFragment.access$getMViewModel(this.this$0);
            final ContactsListFragment contactsListFragment = this.this$0;
            contactsListViewModelAccess$getMViewModel.filterByKey(str, new Function1() { // from class: ah4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ContactsListFragment$mHandler$1.handleMessage$lambda$0(contactsListFragment, (List) obj2);
                }
            });
        }
    }
}
