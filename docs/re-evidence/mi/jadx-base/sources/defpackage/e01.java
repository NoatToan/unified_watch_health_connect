package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.xiaomi.ai.api.Common;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class e01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Object> f16109a = new HashMap();

    public e01() {
        m("aivs.env", 0);
        m("auth.req_token_mode", 0);
        l("auth.support_multiply_client_id", false);
        m("connection.connect_timeout", 15);
        m("connection.offline_connect_timeout", 3);
        m("connection.max_reconnect_interval", 1800);
        m("connection.http_dns_expire_in", BaseSyncBiz.RECORD_MAX_LIFETIME);
        m("connection.refresh_http_dns_interval", 30);
        m("connection.keep_alive_type", 1);
        m("connection.max_keep_alive_time", 900);
        m("connection.ping_interval", 90);
        m("connection.xmd_ping_interval", 30);
        l("connection.quit_if_new_token_invalid", false);
        l("connection.enable_http_dns", true);
        l("connection.enable_abroad_url", false);
        l("connection.enable_instruction_ack", true);
        l("connection.enable_refresh_token_limit", true);
        m("connection.refresh_token_min_interval", 10);
        m("connection.max_refresh_times_during_limit", 3);
        l("connection.enable_refresh_token_ahead", true);
        l("connection.enable_ipv6_http_dns", false);
        l("connection.enable_cloud_control", true);
        l("connection.enable_horse_race", true);
        m("connection.tcp_horse_num", 3);
        m("connection.horse_race_timeout", 5000);
        m("connection.horse_race_interval", 300);
        m("connection.xmd_event_resend_count", 10);
        m("connection.xmd_binary_resend_count", 8);
        m("connection.xmd_resend_delay", 300);
        m("connection.xmd_stream_wait_time", 5000);
        m("connection.xmd_conn_resend_count", 10);
        m("connection.xmd_conn_resend_delay", 200);
        l("connection.enable_lite_crypt", true);
        m("connection.xmd_ws_expire_in", RepositoryManager.GAP_A_DAY);
        m("connection.net_available_wait_time", 3000);
        m("connection.dns_fail_count", 4);
        m("connection.dns_fail_time", 2000);
        l("connection.xmd_enable_mtu_detect", true);
        m("connection.xmd_slice_size", 1320);
        m("connection.try_again_threshold", 3000);
        l("connection.use_online_in_offline_mode", true);
        n("connection.offline_low_memory_standard", 1073741824L);
        l("auth.device.id.use.imei", true);
        o("asr.codec", "OPUS");
        m("asr.bits", 16);
        m("asr.bitrate", 16000);
        m("asr.channel", 1);
        m("asr.vad_type", 1);
        l("asr.enable_new_vad", false);
        m("asr.recv_timeout", 6);
        m("asr.minvoice", 25);
        m("asr.minsil", 50);
        m("asr.maxvoice", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        m("asr.max_length_reset", 6000);
        o("asr.lang", "zh-CN");
        l("asr.enable_partial_result", true);
        l("asr.remove_end_punctuation", true);
        l("asr.enable_smart_volume", false);
        m("asr.duplex_timeout", 5);
        o("tts.codec", "MP3");
        o("tts.lang", "zh-CN");
        o("tts.audio_type", "stream");
        l("tts.enable_internal_player", true);
        m("tts.recv_timeout", 5);
        l("track.enable", true);
        m("track.max_track_data_size", 95);
        m("track.max_track_internal_data_size", 10);
        n("track.max_local_track_length", PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        m("track.max_track_times", 100);
        m("track.max_wait_time", 10);
        m("track.cache_period_check_interval", 10);
        m("track.disk_period_check_interval", 1200);
        m("continuousdialog.head_timeout", 3);
        m("continuousdialog.pause_timeout", 3);
        m("continuousdialog.max_cache_size", 9600);
        m("continuousdialog.max_segment_num", 2);
        l("continuousdialog.enable_timeout", true);
        l("logupload.enable", false);
        m("logupload.max_track_data_size", 1000);
        m("logupload.max_data_track_times", 100);
        m("logupload.max_entrance_track_times", 300);
        m("logupload.period_check_interval", 10);
        m("logupload.disk_period_check_interval", 1200);
        n("logupload.max_local_track_length", PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        m("general_track.max_track_data_size", 45);
        m("general_track.max_track_times", 100);
        m("general_track.period_check_interval", 10);
        m("general_track.disk_period_check_interval", 120);
        n("general_track.max_local_track_length", PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        l("LimitedDiskCache.enable", false);
        m("LimitedDiskCache.max_disk_save_times", 500);
        l("connection.enable_client_ping", false);
        m("connection.client_ping_interval", 5);
        m("connection.client_ping_timeout", 3);
    }

    public boolean a(String str) {
        return this.f16109a.containsKey(str);
    }

    public boolean b(String str) {
        return c(str, false);
    }

    public boolean c(String str, boolean z) {
        Object obj = this.f16109a.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            return z;
        }
    }

    public Common.LocaleRegion d(String str) {
        Object obj = this.f16109a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Common.LocaleRegion) obj;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public int e(String str) {
        return f(str, 0);
    }

    public int f(String str, int i) {
        Object obj = this.f16109a.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException unused) {
            return i;
        }
    }

    public long g(String str) {
        return h(str, 0L);
    }

    public long h(String str, long j) {
        Object obj = this.f16109a.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException unused) {
            return j;
        }
    }

    public String i(String str) {
        try {
            return (String) this.f16109a.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public String j(String str, String str2) {
        String strI = i(str);
        return strI == null ? str2 : strI;
    }

    public List<String> k(String str) {
        Object obj = this.f16109a.get(str);
        if (obj == null) {
            return Collections.emptyList();
        }
        try {
            return (List) obj;
        } catch (ClassCastException unused) {
            return Collections.emptyList();
        }
    }

    public void l(String str, boolean z) {
        this.f16109a.put(str, Boolean.valueOf(z));
    }

    public void m(String str, int i) {
        this.f16109a.put(str, Integer.valueOf(i));
    }

    public void n(String str, long j) {
        this.f16109a.put(str, Long.valueOf(j));
    }

    public void o(String str, String str2) {
        this.f16109a.put(str, str2);
    }
}
