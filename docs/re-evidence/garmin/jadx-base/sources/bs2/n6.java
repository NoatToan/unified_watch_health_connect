package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class n6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20328e;

    static {
        bk bkVar = new bk("debug_antfs_host", 73);
        f20328e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("success", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("link_failed", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("link_failed_rx_fail", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("link_failed_rx_search", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("link_failed_rx_timeout", 4, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_beacon_timeout", 5, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_bad_state", 6, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_link_rx_fail", 7, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_link_rx_search", 8, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_link_rx_timeout", 9, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_auth_rx_timeout", 10, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_auth_rx_search", 11, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_rx_search", 12, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_rx_sync", 13, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_upl_resp_error", 14, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_upl_read_error", 15, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_tx_sync_error", 16, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_tx_error", 17, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_rx_error", 18, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_upl_resp_timeout", 19, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_down_requ_error", 20, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_uplr_requ_error", 21, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_disconnect_error", 22, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_down_resp_error", 23, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_crc_error", 24, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_write_error", 25, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_uplr_resp_error", 26, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_upl_error", 27, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("transfer_error_transport_upl_requ_error", 28, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public n6() {
        super(wb.b(73));
    }

    public n6(bk bkVar) {
        super(bkVar);
    }
}
