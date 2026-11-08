package com.unified.health.core.demo

import com.unified.health.core.demo.virtual.GarminVirtualWatchIdentity
import com.unified.health.core.demo.virtual.StandardVirtualWatch
import com.unified.health.core.demo.virtual.ZeppVirtualWatchIdentity
import com.unified.health.core.demo.virtual.huawei.HuaweiAuthRequiredVirtualDevice
import com.unified.health.core.demo.virtual.huawei.HuaweiVirtualDevice

/**
 * Every device id (BLE address) a virtual/mock watch can sync under. "Clear demo data" deletes only
 * rows tagged with one of these, so real watch data is never touched even if a real device happens
 * to be paired and synced at the same time (D-71x).
 */
object DemoDeviceIds {
    val ALL: List<String> = listOf(
        DemoDevice.ADDRESS,
        GarminVirtualWatchIdentity.ADDRESS,
        ZeppVirtualWatchIdentity.ADDRESS,
        StandardVirtualWatch.ADDRESS,
        HuaweiVirtualDevice.ADDRESS,
        HuaweiAuthRequiredVirtualDevice.ADDRESS,
    )
}
