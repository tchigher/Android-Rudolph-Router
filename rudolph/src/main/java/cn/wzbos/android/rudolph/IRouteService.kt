package cn.wzbos.android.rudolph

import android.os.Bundle

/**
 * 路由服务接口
 */
interface IRouteService {
    /**
     * 初始化方法
     *
     * @param bundle 外部传递参数
     */
    fun init(bundle: Bundle?)
}