package com.huami.widget.share;

import com.huami.widget.share.utils.ShareStatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/widget/share/ShareTargetFactory;", "", "", "shareType", "Lcom/huami/widget/share/ShareTarget;", "create", "<init>", "()V", "share_release"}, k = 1, mv = {1, 5, 1})
public final class ShareTargetFactory {

    @NotNull
    public static final ShareTargetFactory INSTANCE = new ShareTargetFactory();

    private ShareTargetFactory() {
    }

    @NotNull
    public final ShareTarget create(int shareType) {
        switch (shareType) {
            case 1:
                return new ShareTarget(R.drawable.ic_weichat_44, R.string.share_weixin_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_WECHAT, 1);
            case 2:
                return new ShareTarget(R.drawable.ic_moments_44, R.string.share_pengyouquan_label, ShareStatEvent.VALUE_SHARE_TO_WECHAT_FRIENDS, 2);
            case 3:
            case 10:
            case 11:
            case 12:
            case 15:
            default:
                throw new IllegalStateException("不支持的分享类型 " + shareType);
            case 4:
                return new ShareTarget(R.drawable.ic_weibo_44, R.string.share_weibo_label, ShareStatEvent.VALUE_SHARE_TO_WEIBO, 4);
            case 5:
                return new ShareTarget(R.drawable.ic_qzone_44, R.string.share_qq_zone_label, ShareStatEvent.VALUE_SHARE_TO_QQ_ZONE, 5);
            case 6:
                return new ShareTarget(R.drawable.ic_qq_44, R.string.share_qq_label, ShareStatEvent.VALUE_SHARE_TO_QQ, 6);
            case 7:
                return new ShareTarget(R.drawable.ic_line_44, R.string.share_line_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_LINE, 7);
            case 8:
                return new ShareTarget(R.drawable.ic_facebook_44, R.string.share_facebook_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_FACEBOOK, 8);
            case 9:
                return new ShareTarget(R.drawable.ic_twitter_44, R.string.share_twitter_label_untranslates, ShareStatEvent.VALUE_SHARE_TO_TWITTER, 9);
            case 13:
                return new ShareTarget(R.drawable.ic_download_44, R.string.share_to_local, ShareStatEvent.VALUE_SHARE_TO_LOCAL, 13);
            case 14:
                return new ShareTarget(R.drawable.ic_midongquan_44, R.string.share_mifit_circle_label, ShareStatEvent.VALUE_SHARE_TO_MIFIT_CIRCLE, 14);
            case 16:
                ShareTarget shareTarget = new ShareTarget(R.drawable.detail_icon_share_coppy, R.string.share_copy, ShareStatEvent.VALUE_SHARE_TO_COPY, 16);
                shareTarget.enable = true;
                return shareTarget;
            case 17:
                ShareTarget shareTarget2 = new ShareTarget(R.drawable.detail_icon_share_report, R.string.share_report, ShareStatEvent.VALUE_SHARE_TO_REPORT, 17);
                shareTarget2.enable = true;
                return shareTarget2;
            case 18:
                ShareTarget shareTarget3 = new ShareTarget(R.drawable.detail_icon_share_pullblack, R.string.share_block, ShareStatEvent.VALUE_SHARE_TO_BLOCK, 18);
                shareTarget3.enable = true;
                return shareTarget3;
            case 19:
                ShareTarget shareTarget4 = new ShareTarget(R.drawable.share_detail_icon_delete, R.string.share_optional_delete, ShareStatEvent.VALUE_SHARE_TO_DELETE, 19);
                shareTarget4.enable = true;
                return shareTarget4;
        }
    }
}
