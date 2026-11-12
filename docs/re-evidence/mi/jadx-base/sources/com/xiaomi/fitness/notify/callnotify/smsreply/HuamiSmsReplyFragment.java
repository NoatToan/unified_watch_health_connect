package com.xiaomi.fitness.notify.callnotify.smsreply;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/HuamiSmsReplyFragment;", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyFragment;", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/HuamiSmsReplyViewModel;", "<init>", "()V", "doDeleteSms", "", "position", "", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiSmsReplyFragment extends Hilt_HuamiSmsReplyFragment<HuamiSmsReplyViewModel> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyFragment
    public void doDeleteSms(int position) {
        HuamiSmsReplyViewModel huamiSmsReplyViewModel = (HuamiSmsReplyViewModel) getMViewModel();
        SmsAdapter.Sms item = getMAdapter().getItem(position);
        Intrinsics.checkNotNull(item);
        huamiSmsReplyViewModel.deleteSms(item.getId());
    }
}
